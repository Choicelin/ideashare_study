package mini.ideashare.cms.manager;

import mini.ideashare.cms.dao.ArticleDAO;
import mini.ideashare.cms.dao.ArticleTypeDAO;
import mini.ideashare.cms.model.ArticleDetail;
import mini.ideashare.cms.model.ArticleType;
import mini.ideashare.cms.qc.ArticleDetailQC;
import mini.ideashare.cms.qc.ArticleTypeQC;
import mini.ideashare.cms.qc.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;


@Component
public class ArticleManager {
    @Autowired
    private ArticleDAO articleDAO;

    @Autowired
    private ArticleTypeDAO articleTypeDAO;

    public ArticleDetail getArticleDetailById(Integer id){
        ArticleDetailQC qc = new ArticleDetailQC();
        qc.setId(id);
        return articleDAO.listArticleDetail(qc).get(0);
    }
    public boolean saveArticleDetail(ArticleDetail articleDetail){
        if(null==articleDetail.getId()){
            //如果id为空的话，那就是新增
            articleDetail.setCreateTime(new Date());
            return articleDAO.insertArticleDetail(articleDetail)>1;
        }else {
            //如果id不为空的话，那就是更新
            articleDetail.setUpdateTime(new Date());
            return articleDAO.updateArticleDetail(articleDetail)>1;
        }
    }

    public List<ArticleDetail> listArticleByType(Integer typeId,Integer pageIndex,Integer pageSize){
        ArticleDetailQC qc = new ArticleDetailQC();
        qc.setSortBy("id");
        qc.setSortType("desc");
        Page page = new Page(pageIndex, pageSize);
        qc.setTypeId(typeId).setPage(page);
        return articleDAO.listArticleDetail(qc);
    }

    public int countArticleByType(Integer typeId){
        ArticleDetailQC qc = new ArticleDetailQC();
        qc.setTypeId(typeId);
        return articleDAO.countArticleDetail(qc);
    }


    public List<ArticleType> getAllArticleType(){
        ArticleTypeQC qc = new ArticleTypeQC();

        return articleTypeDAO.listArticleType(qc);
    }

}
