package mini.ideashare.cms.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("unchecked")
@Service
public class RedisUtil {
    public static final String USER_KEY = "IS_USER_";
    public static final String CRM_LOGIN_VER_MAX = "CRM_LOGIN_VER_MAX_";
    public static final Long IS_LOGIN_MAX = 60L * 60 * 12;
    public static final String CRM_LOGIN_VER = "CRM_LOGIN_VER_";
    public static final Long CRM_LOGIN_VER_E = 90L;
    public static final String CRM_API_TOKEN = "CRM_API_TOKEN_";
    public static final Long CRM_API_TOKEN_E = 60L * 5;

    @SuppressWarnings("rawtypes")
    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 批量删除对应的value
     *
     * @param keys
     */
    public void remove(final String... keys) {
        for (String key : keys) {
            remove(key);
        }
    }

    /**
     * 批量删除key
     *
     * @param pattern
     */
    public void removePattern(final String pattern) {
        Set<Serializable> keys = redisTemplate.keys(pattern);
        if (!keys.isEmpty())
            redisTemplate.delete(keys);
    }

    /**
     * 删除对应的value
     *
     * @param key
     */
    public void remove(final String key) {
        if (exists(key)) {
            redisTemplate.delete(key);
        }
    }

    /**
     * 判断缓存中是否有对应的value
     *
     * @param key
     * @return
     */
    public boolean exists(final String key) {
        return redisTemplate.hasKey(key);
    }

    public Set<String> keys(final String pattern) {
        Set<String> keys = redisTemplate.keys(pattern);
        return keys;
    }

    /**
     * 读取缓存
     *
     * @param key
     * @return
     */
    public Object get(final String key) {
        Object result;
        ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
        result = operations.get(key);
        return result;
    }

    /**
     * 写入缓存
     *
     * @param key
     * @param value
     * @return
     */
    public boolean set(final String key, Object value) {
        boolean result = false;
        try {
            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
            operations.set(key, value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 写入缓存
     *
     * @param key
     * @param value
     * @return
     */
    public boolean set(final String key, Object value, Long expireTime) {
        boolean result = false;
        try {
            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
            operations.set(key, value);
            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean expire(final String key, Long expireTime) {
        boolean result = false;
        try {
            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean incr(final String key) {
        boolean result = false;
        try {
            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
            operations.increment(key, 1);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean incrByExpireTime(final String key, Long expireTime) {
        boolean result = false;
        try {
            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
            operations.increment(key, 1);
            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    public boolean validate(final String redisKey) {
        Object code = get(redisKey);
        if (code == null) {
            set(redisKey, "1", 3L);
            return true;
        }
        return false;
    }

    /**
     * 最大计数控制 允许时返回true 不允许返回false
     *
     * @param key
     * @param max
     * @param ctrlTime
     * @return
     */
    public boolean maxControl(String key, Integer max, Long ctrlTime) {
        Object now = get(key);
        if (now == null) {//根本没有
            if (ctrlTime == null) {
                ctrlTime = IS_LOGIN_MAX;
            }
            return incrByExpireTime(key, ctrlTime);
        } else if (Integer.parseInt(now.toString()) < max) {//未达最大 允许
            return incrByExpireTime(key, ctrlTime);
        } else {//最大 不允许
            return false;
        }
    }
}
