package mini.ideashare.cms.dao;

import mini.ideashare.cms.model.User;
import mini.ideashare.cms.qc.UserQC;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDAO {
        int insertUser(User user);
        List<User> listUser(UserQC user);
        Integer countUser(UserQC user);
}
