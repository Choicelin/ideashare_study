package mini.ideashare.cms.controller;

import com.alibaba.fastjson.JSON;
import mini.ideashare.cms.base.BaseResponse;
import mini.ideashare.cms.base.RedisUtil;
import mini.ideashare.cms.manager.UserManager;
import mini.ideashare.cms.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static mini.ideashare.cms.base.RedisUtil.IS_LOGIN_MAX;
import static mini.ideashare.cms.base.RedisUtil.USER_KEY;


@RestController
public class UserController extends AbstractBaseController {

    @Autowired
    private UserManager userManager;

    @Autowired
    private RedisUtil redisUtil;



    // af50542cb89113575262af5c8e225e37
    // wx9a4049b07d5a5bc7


    @PostMapping("/user/register")
    public BaseResponse<Boolean> register(@RequestBody  User user){

        int insert = userManager.register(user);
        return assembleResponse(insert==1);
    }

    @PostMapping("/user/login")
    public BaseResponse<User> login(@RequestBody  User user){
        User login = userManager.login(user);
        if (login!=null){
            redisUtil.set(USER_KEY + login.getId(), JSON.toJSONString(login),IS_LOGIN_MAX);
        }else {
            return assembleResponse(false,"","登录失败");
        }
        return assembleResponse(login);
    }

    @GetMapping("receiveWxLoginCode")
    public BaseResponse<String> receiveWxLoginCode(String code){

        System.out.println("!!!!! code 为:"+code);
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=wx9a4049b07d5a5bc7&secret=af50542cb89113575262af5c8e225e37&js_code="+code+"&grant_type=authorization_code";


      //  String asString = IS_HttpUtils.getAsString(url, null);

     //   System.out.println(asString);

        return assembleResponse("OK");
    }
}
