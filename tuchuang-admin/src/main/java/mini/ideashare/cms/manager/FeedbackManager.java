package mini.ideashare.cms.manager;

import mini.ideashare.cms.dao.ArticleDAO;
import mini.ideashare.cms.dao.ArticleTypeDAO;
import mini.ideashare.cms.dao.FeedbackDAO;
import mini.ideashare.cms.model.ArticleDetail;
import mini.ideashare.cms.model.ArticleType;
import mini.ideashare.cms.model.Feedback;
import mini.ideashare.cms.qc.ArticleDetailQC;
import mini.ideashare.cms.qc.ArticleTypeQC;
import mini.ideashare.cms.qc.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;


@Component
public class FeedbackManager {

    @Autowired
    private FeedbackDAO feedbackDAO;

    public boolean saveFeedback(Feedback feedback){
        feedback.setCreateTime(new Date());
       return feedbackDAO.insertFeedback(feedback)==1;
    }


}
