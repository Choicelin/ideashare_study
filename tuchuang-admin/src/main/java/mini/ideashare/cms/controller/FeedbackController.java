package mini.ideashare.cms.controller;

import mini.ideashare.cms.base.BaseResponse;
import mini.ideashare.cms.base.PageData;
import mini.ideashare.cms.manager.ArticleManager;
import mini.ideashare.cms.manager.FeedbackManager;
import mini.ideashare.cms.model.ArticleDetail;
import mini.ideashare.cms.model.ArticleType;
import mini.ideashare.cms.model.Feedback;
import mini.ideashare.cms.model.vo.ArticleDetailListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author lixiang
 * @CreateTime 2018/5/27
 **/
@RestController
public class FeedbackController extends AbstractBaseController {

    @Autowired
    private FeedbackManager feedbackManager;

    @PostMapping("/feedback/saveFeedback")
    public BaseResponse saveFeedback(@RequestBody Feedback feedback) {
        //需要考虑下怎么从session里面拿用户信息
        boolean successFlag = feedbackManager.saveFeedback(feedback);
        return assembleResponse(successFlag);
    }
}
