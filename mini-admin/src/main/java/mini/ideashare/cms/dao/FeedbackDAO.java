package mini.ideashare.cms.dao;

import mini.ideashare.cms.model.Feedback;
import mini.ideashare.cms.qc.FeedbackQC;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface FeedbackDAO {

    int insertFeedback(Feedback feedback);
    List<Feedback> listFeedback(FeedbackQC feedback);
    Integer countFeedback(FeedbackQC feedback);
}
