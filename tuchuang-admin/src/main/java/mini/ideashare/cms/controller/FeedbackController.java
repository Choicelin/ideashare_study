package mini.ideashare.cms.controller;

import com.alibaba.fastjson.JSON;
import mini.ideashare.cms.base.BaseResponse;
import mini.ideashare.cms.base.PageData;
import mini.ideashare.cms.manager.ArticleManager;
import mini.ideashare.cms.manager.FeedbackManager;
import mini.ideashare.cms.model.ArticleDetail;
import mini.ideashare.cms.model.ArticleType;
import mini.ideashare.cms.model.Feedback;
import mini.ideashare.cms.model.vo.ArticleDetailListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tech.ideashare.utils.is_mail.IS_MailConfig;
import tech.ideashare.utils.is_mail.IS_MailUtils;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
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
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.execute(()->{
            System.out.println("Begin to Send Email");
            IS_MailConfig mailConfig = new IS_MailConfig("smtp.mxhichina.com",465,"tongzhuang@ideashare.tech","DeMeng888");
            mailConfig.setReceiverAddr(new String[]{"lixiang9409@vip.qq.com","413807584@qq.com"});
            IS_MailUtils.sendSimpleBySMTP(mailConfig,"全栈工坊反馈信息", JSON.toJSONString(feedback));
        });
        boolean successFlag = feedbackManager.saveFeedback(feedback);
        return assembleResponse(successFlag);
    }
}
