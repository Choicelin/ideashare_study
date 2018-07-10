package mini.ideashare.cms.dao;

import mini.ideashare.cms.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDAO {
        int insert(User user);
}
