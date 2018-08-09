package mini.ideashare.cms.controller;


import com.alibaba.fastjson.JSON;
import mini.ideashare.cms.base.BaseResponse;
import mini.ideashare.cms.base.PageData;
import mini.ideashare.cms.base.RedisUtil;
import mini.ideashare.cms.base.RequestResponseContext;
import mini.ideashare.cms.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;

import static mini.ideashare.cms.base.RedisUtil.USER_KEY;

/**
 * 基本的Controller ， 所有的Controller都要去继承这个类
 * 提供了logger的初始化（在每个Controller中不用再new一个logger）
 * 提供了对普通返回结果，分页返回结果的封装
 * Created by lixiang on 2018/3/2.
 */
@CrossOrigin
@RestController
public abstract class AbstractBaseController {

    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private RedisUtil redisUtil;

    private static final String DOMAIN = "fenxiangtech.com";




    @ModelAttribute
    public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
        RequestResponseContext.setRequest(request);
        RequestResponseContext.setResponse(response);
    }

    public User getUserByToken(String token) {
        try {
            //先从request中
            String json = redisUtil.get(USER_KEY + token).toString();
            return JSON.parseObject(json, User.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public User getUserByCookieId(){
        try {
            String id = getCookieValue("id");
            String s = redisUtil.get(USER_KEY + id).toString();
            return JSON.parseObject(s, User.class);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    public HttpServletRequest getRequest() {
        return RequestResponseContext.getRequest();
    }

    public HttpServletResponse getResponse() {
        return RequestResponseContext.getResponse();
    }

    /**
     * 获得cookie对应的值
     *
     * @param key 对应的键
     * @return 返回值
     */
    public String getCookieValue(String key) {
        Cookie cookie = this.getCookie(key);
        if (cookie != null) {
            try {
                return URLDecoder.decode(cookie.getValue(), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 根据键获取对应的cookie对象
     *
     * @param key 对应的key
     * @return key对应的cookie值
     */
    public Cookie getCookie(String key) {
        Cookie[] cookies = this.getRequest().getCookies();
        if (cookies == null || cookies.length < 1) {
            return null;
        }

        for (Cookie temp : cookies) {
            if (temp.getName().equals(key)) {
                return temp;
            }
        }
        return null;
    }

    /**
     * 加入值到cookies里
     *
     * @param key
     * @param value
     */
    public void addCookie(String key, String value) {
        Cookie cookie = new Cookie(key, value);
        cookie.setPath("/");// 这个要设置
        cookie.setDomain(DOMAIN);
        // 不设置的话，则cookies不写入硬盘,而是写在内存,只在当前页面有用,以秒为单位
        cookie.setMaxAge(365 * 24 * 60 * 60);
        this.getResponse().addCookie(cookie);
    }

    public void addCookie(String key, String value, int time) {
        Cookie cookie = new Cookie(key, value);
        cookie.setPath("/");// 这个要设置
        cookie.setDomain(DOMAIN);
        // 不设置的话，则cookies不写入硬盘,而是写在内存,只在当前页面有用,以秒为单位
        cookie.setMaxAge(time);
        this.getResponse().addCookie(cookie);
    }

    public void addCookie(String key, String value, String domain) {
        addCookie(key, value, domain, (365 * 24 * 60 * 60));
    }

    public void addCookie(String key, String value, String domain, int time) {
        try {
            if (null != value) {
                value = URLEncoder.encode(value, "UTF-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Cookie cookie = new Cookie(key, value);
        cookie.setPath("/");// 这个要设置
        cookie.setDomain(DOMAIN);
        // 不设置的话，则cookies不写入硬盘,而是写在内存,只在当前页面有用,以秒为单位
        if (time > 0) {
            cookie.setMaxAge(time);
        }
        if (domain != null) {
            cookie.setDomain(domain);
        }
        this.getResponse().addCookie(cookie);
    }

    /**
     * @param data
     * @param message
     * @param success
     * @return
     */
    public <T> BaseResponse<T> assembleResponse(T data, String message, boolean success) {
        BaseResponse<T> baseResponse = new BaseResponse<T>();
        baseResponse.setData(data);
        baseResponse.setMessage(message);
        baseResponse.setSuccess(success);
        return baseResponse;
    }
    public <T> BaseResponse<T> assembleResponse(T data, String message, String messageCode,boolean success) {
        BaseResponse<T> baseResponse = new BaseResponse<T>();
        baseResponse.setData(data);
        baseResponse.setMessage(message);
        baseResponse.setSuccess(success);
        baseResponse.setMessageCode(messageCode);
        return baseResponse;
    }


    public <T> BaseResponse<T> assembleResponse(boolean success, String messageCode,String message) {
        BaseResponse<T> baseResponse = new BaseResponse<T>();
        baseResponse.setMessage(message);
        baseResponse.setSuccess(success);
        baseResponse.setMessageCode(messageCode);
        return baseResponse;
    }




    public <T> BaseResponse<T> assembleResponse(T data, boolean success) {
        return assembleResponse(data, "", success);
    }

    public <T> BaseResponse<T> assembleResponse(T data) {
        return assembleResponse(data, true);
    }

    public <T> BaseResponse<PageData<T>> assemblePageResponse(List<T> data, int totalCount, int pageIndex, int pageSize) {
        PageData<T> pageData = new PageData<>(pageIndex, pageSize, totalCount, data);
        return assembleResponse(pageData);
    }
}
