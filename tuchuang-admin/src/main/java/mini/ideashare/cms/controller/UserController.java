package mini.ideashare.cms.controller;

import mini.ideashare.cms.base.BaseResponse;
import mini.ideashare.cms.manager.UserManager;
import mini.ideashare.cms.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class UserController {
    @Autowired
    private UserManager userManager;
    @PostMapping("/user/saveUser")
    public int insert(@RequestBody  User user){
        return userManager.insert(user);
    }
    @GetMapping("receiveWxLoginCode")
    public BaseResponse receive(String code){
     //  System.out.println(code);
       return null;
}
}
