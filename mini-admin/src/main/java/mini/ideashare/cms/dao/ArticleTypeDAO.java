package mini.ideashare.cms.dao;

import mini.ideashare.cms.model.ArticleType;
import mini.ideashare.cms.qc.ArticleTypeQC;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArticleTypeDAO {
    int insertArticleType(ArticleType articleType);
    List<ArticleType> listArticleType(ArticleTypeQC articleType);
    Integer countArticleType(ArticleTypeQC articleType);
}
