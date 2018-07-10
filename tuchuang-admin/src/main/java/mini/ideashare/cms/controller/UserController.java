package mini.ideashare.cms.controller;

import mini.ideashare.cms.manager.UserManager;
import mini.ideashare.cms.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserManager userManager;
    @PostMapping("/user/saveUser")
    public int insert(User user){
        return userManager.insert(user);
    }
}
