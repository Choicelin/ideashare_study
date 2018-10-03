package mini.ideashare.cms.manager;

import mini.ideashare.cms.dao.AnswerDAO;
import mini.ideashare.cms.dao.QuestionDAO;
import mini.ideashare.cms.model.Answer;
import mini.ideashare.cms.model.Question;
import mini.ideashare.cms.model.qc.AnswerQC;
import mini.ideashare.cms.model.qc.Page;
import mini.ideashare.cms.model.qc.QuestionQC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
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

    public boolean saveQuestion(Question question){

        question.setCreateTime(new Date());
        return questionDAO.insertQuestion(question)>1;

    }
    public boolean saveAnswer(Answer answer){

        answer.setCreateTime(new Date());
        return answerDAO.insertAnswer(answer)>1;

    }

    public List<Answer> listAnswerByQuestionId(Long questionId){
        AnswerQC qc = new AnswerQC();
        qc.setQuestionId(questionId);
        return answerDAO.listAnswer(qc);
    }

    public List<Question> listQuestionByQC(QuestionQC qc){

        return questionDAO.listQuestion(qc);
    }


}
