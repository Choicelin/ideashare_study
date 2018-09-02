package mini.ideashare.cms.dao;

import mini.ideashare.cms.model.Answer;
import mini.ideashare.cms.model.qc.AnswerQC;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author lixiang
 * @CreateTime 2018/9/1
 **/
@Mapper
@Repository
public interface AnswerDAO {
    int insertAnswer(Answer answer);
    List<Answer> listAnswer(AnswerQC answer);
    Integer countAnswer(AnswerQC answer);
}
