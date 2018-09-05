package mini.ideashare.cms.manager;

import mini.ideashare.cms.dao.AnswerDAO;
import mini.ideashare.cms.dao.QuestionDAO;
import mini.ideashare.cms.model.Question;
import mini.ideashare.cms.model.qc.Page;
import mini.ideashare.cms.model.qc.QuestionQC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author lixiang
 * @CreateTime 2018/9/1
 **/
@Component
public class AskManager {

    @Autowired
    private QuestionDAO questionDAO;

    @Autowired
    private AnswerDAO answerDAO;

    public List<Question> listQuestionByType(Integer typeId, Integer pageIndex, Integer pageSize){
        QuestionQC qc = new QuestionQC();
        qc.setSortBy("id");
        qc.setSortType("desc");
        Page page = new Page(pageIndex, pageSize);
        qc.setTypeId(typeId).setPage(page);
        return questionDAO.listQuestion(qc);
    }
    public int countQuestionByType(Integer typeId){
        QuestionQC qc = new QuestionQC();
        qc.setTypeId(typeId);
        return questionDAO.countQuestion(qc);
    }


}