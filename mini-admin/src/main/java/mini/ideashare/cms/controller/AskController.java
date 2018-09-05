package mini.ideashare.cms.controller;

import mini.ideashare.cms.base.BaseResponse;
import mini.ideashare.cms.base.PageData;
import mini.ideashare.cms.manager.AskManager;
import mini.ideashare.cms.model.Answer;
import mini.ideashare.cms.model.Question;
import mini.ideashare.cms.model.vo.ArticleDetailListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author lixiang
 * @CreateTime 2018/9/1
 **/
@RestController
public class AskController extends AbstractBaseController {

    @Autowired
    private AskManager askManager;

    @GetMapping("/ask/listQuestionByType")
    public BaseResponse<PageData<Question>> listArticleByType(@RequestParam(required = false) Integer typeId,
                                                                         @RequestParam Integer pageIndex,
                                                                         @RequestParam Integer pageSize) {
        List<Question> questions = askManager.listQuestionByType(typeId, pageIndex, pageSize);

        int count = askManager.countQuestionByType(typeId);

        return assemblePageResponse(questions,count,pageIndex,pageSize);
    }

    @PostMapping("/ask/saveQuestion")
    public BaseResponse saveArticleDetail(@RequestBody Question question) {
        boolean successFlag = askManager.saveQuestion(question);
        return assembleResponse(successFlag);
    }

    @GetMapping("/ask/listAnswerByQuestionId")
    public BaseResponse<List<Answer>> listAnswerByQuestionId(@RequestParam Long questionId) {

        List<Answer> answers = askManager.listAnswerByQuestionId(questionId);

        return assembleResponse(answers);
    }
}
