package mini.ideashare.cms.controller;

import mini.ideashare.cms.base.BaseResponse;
import mini.ideashare.cms.base.PageData;
import mini.ideashare.cms.manager.AskManager;
import mini.ideashare.cms.model.Answer;
import mini.ideashare.cms.model.Question;
import mini.ideashare.cms.model.qc.QuestionQC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author lixiang
 * @CreateTime 2018/9/1
 **/
@RestController
public class AskController extends AbstractBaseController {

    @Autowired
    private AskManager askManager;

    @GetMapping("/ask/listQuestionByType")
    public BaseResponse<PageData<Question>> listQuestionByType(@RequestParam(required = false) Integer typeId,
                                                                         @RequestParam Integer pageIndex,
                                                                         @RequestParam Integer pageSize) {
        List<Question> questions = askManager.listQuestionByType(typeId, pageIndex, pageSize);

        int count = askManager.countQuestionByType(typeId);

        return assemblePageResponse(questions,count,pageIndex,pageSize);
    }

    @PostMapping("/ask/saveQuestion")
    public BaseResponse saveQuestion(@RequestBody Question question) {

        if(null !=question.getId()){
            //如果存在id ，则是回复
            Answer answer = new Answer();
            answer.setContent(question.getContent()).setQuestionId(question.getId());
            boolean successFlag =  askManager.saveAnswer(answer);
            return assembleResponse(successFlag);
        }
        boolean successFlag = askManager.saveQuestion(question);
        return assembleResponse(successFlag);
    }

    @GetMapping("/ask/listAnswerByQuestionId")
    public BaseResponse<Map> listAnswerByQuestionId(@RequestParam Long questionId) {

        Map<String,Object> map = new HashMap<>();
        QuestionQC questionQC = new QuestionQC();
        questionQC.setId(questionId);
        List<Question> questions = askManager.listQuestionByQC(questionQC);
        Question question = questions.get(0);

        List<Answer> answers = askManager.listAnswerByQuestionId(questionId);
        map.put("question",question);
        map.put("answers",answers);

        return assembleResponse(map);
    }
}
