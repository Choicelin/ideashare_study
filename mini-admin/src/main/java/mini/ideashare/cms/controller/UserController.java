package mini.ideashare.cms.controller;

import mini.ideashare.cms.base.BaseResponse;
import mini.ideashare.cms.manager.UserManager;
import mini.ideashare.cms.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.ideashare.utils.IS_HttpUtils;


@RestController
public class UserController extends AbstractBaseController {

    @Autowired
    private UserManager userManager;



    // af50542cb89113575262af5c8e225e37
    // wx9a4049b07d5a5bc7


    @PostMapping("/user/register")
    public BaseResponse<Boolean> insert(@RequestBody  User user){

        int insert = userManager.insert(user);
        return assembleResponse(insert==1);
    }

    @PostMapping("/user/login")
    public BaseResponse<User> login(@RequestBody  User user){
        User login = userManager.login(user);
        return assembleResponse(login);
    }

    @GetMapping("receiveWxLoginCode")
    public BaseResponse<String> receiveWxLoginCode(String code){

        System.out.println("!!!!! code 为:"+code);
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=wx9a4049b07d5a5bc7&secret=af50542cb89113575262af5c8e225e37&js_code="+code+"&grant_type=authorization_code";


        String asString = IS_HttpUtils.getAsString(url, null);

        System.out.println(asString);

        return assembleResponse("OK");
    }
}
