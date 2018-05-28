package mini.ideashare.cms.controller;

import mini.ideashare.cms.base.BaseResponse;
import mini.ideashare.cms.base.PageData;
import mini.ideashare.cms.manager.ArticleManager;
import mini.ideashare.cms.model.ArticleDetail;
import mini.ideashare.cms.model.ArticleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author lixiang
 * @CreateTime 2018/5/27
 **/
@RestController
public class ArticleController extends AbstractBaseController{

    @Autowired
    private ArticleManager articleManager;

    @GetMapping("/article/getArticleDetailById")
    public BaseResponse<ArticleDetail> getArticleDetail(@RequestParam Integer id){
       ArticleDetail articleDetail = articleManager.getArticleDetailById(id);
       return assembleResponse(articleDetail);
    }

    @GetMapping("/article/listArticleByType")
    public BaseResponse<PageData<ArticleDetail>> listArticleByType(@RequestParam Integer typeId,
                                                                   @RequestParam Integer pageIndex,
                                                                   @RequestParam Integer pageSize){
       List<ArticleDetail> articleDetails = articleManager.listArticleByType(typeId,pageIndex,pageSize);
       int totalCount = articleManager.countArticleByType(typeId);
       return assemblePageResponse(articleDetails,totalCount,pageIndex,pageSize);
    }



    @GetMapping("/article/getAllArticleType")
    public BaseResponse<PageData<ArticleType>> getAllArticleType(){
       List<ArticleType> articleTypes = articleManager.getAllArticleType();
       return assemblePageResponse(articleTypes,0,0,0);
    }
}
