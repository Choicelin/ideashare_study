package mini.ideashare.cms.dao;

import mini.ideashare.cms.model.Practice;
import mini.ideashare.cms.qc.PracticeQC;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author lixiang
 * @CreateTime 2018/8/9
 **/
@Mapper
@Repository
public interface PracticeDAO {
    int insertPractice(Practice practice);
    List<Practice> listPractice(PracticeQC practice);
    Integer countPractice(PracticeQC practice);
    int updatePractice(Practice practice);
    int updatePvAndLikeCount(Practice practice);
}
