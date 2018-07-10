package mini.ideashare.cms.manager;

import mini.ideashare.cms.dao.UserDAO;
import mini.ideashare.cms.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserManager {
    @Autowired
    private UserDAO userDAO;
    public int insert(User user){
        return userDAO.insert(user);
    }
}
