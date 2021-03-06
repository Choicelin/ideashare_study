package mini.ideashare.cms.manager;

import mini.ideashare.cms.dao.FeedbackDAO;
import mini.ideashare.cms.model.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class FeedbackManager {

    @Autowired
    private FeedbackDAO feedbackDAO;

    public boolean saveFeedback(Feedback feedback){
        if(feedback.getContent()==null||feedback.getContent().equals("")){
            return false;
        }
        feedback.setCreateTime(new Date());
       return feedbackDAO.insertFeedback(feedback)==1;
    }


}
