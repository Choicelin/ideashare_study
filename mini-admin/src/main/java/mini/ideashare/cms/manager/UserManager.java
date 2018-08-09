package mini.ideashare.cms.manager;

import mini.ideashare.cms.dao.UserDAO;
import mini.ideashare.cms.model.User;
import mini.ideashare.cms.qc.UserQC;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserManager {
    @Autowired
    private UserDAO userDAO;

    public int register(User user){
        if(StringUtils.isEmpty(user.getUserName())){
            return 0;
        }
        if(StringUtils.isEmpty(user.getPassword())){
            return 0;
        }
        return userDAO.insertUser(user);
    }

    public User login(User user){
        UserQC userQC = new UserQC();
        userQC.setUserName(user.getUserName());
        userQC.setPassword(user.getPassword());
        List<User> userList = userDAO.listUser(userQC);
        if(userList.size()>0){
            return userList.get(0);
        }else {
            return null;
        }

    }
}
