package mini.ideashare.cms.dao;

import mini.ideashare.cms.model.ArticleDetail;
import mini.ideashare.cms.qc.ArticleDetailQC;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArticleDAO {
    int insertArticleDetail(ArticleDetail articleDetail);
    List<ArticleDetail> listArticleDetail(ArticleDetailQC articleDetail);
    Integer countArticleDetail(ArticleDetailQC articleDetail);
}
