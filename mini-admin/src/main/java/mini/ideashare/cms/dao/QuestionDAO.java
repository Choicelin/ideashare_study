package mini.ideashare.cms.dao;

import mini.ideashare.cms.model.Question;
import mini.ideashare.cms.model.qc.QuestionQC;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author lixiang
 * @CreateTime 2018/9/1
 **/
@Mapper
@Repository
public interface QuestionDAO {
    int insertQuestion(Question question);
    List<Question> listQuestion(QuestionQC question);
    Integer countQuestion(QuestionQC question);
}
