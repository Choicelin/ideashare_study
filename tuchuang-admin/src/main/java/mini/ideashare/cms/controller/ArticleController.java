package mini.ideashare.cms.controller;

import mini.ideashare.cms.base.BaseResponse;
import mini.ideashare.cms.base.PageData;
import mini.ideashare.cms.manager.ArticleManager;
import mini.ideashare.cms.model.ArticleDetail;
import mini.ideashare.cms.model.ArticleType;
import mini.ideashare.cms.model.vo.ArticleDetailListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @Author lixiang
 * @CreateTime 2018/5/27
 **/
@RestController
public class ArticleController extends AbstractBaseController {

    @Autowired
    private ArticleManager articleManager;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/article/getArticleDetailById")
    public BaseResponse<ArticleDetail> getArticleDetail(@RequestParam Integer id) {
        ArticleDetail articleDetail = articleManager.getArticleDetailById(id);
        return assembleResponse(articleDetail);
    }

    @PostMapping("/article/saveArticleDetail")
    public BaseResponse saveArticleDetail(@RequestParam(required = false) Integer id,
                                          @RequestParam String title,
                                          @RequestParam String summary,
                                          @RequestParam String content) {
        //需要考虑下怎么从session里面拿用户信息

        ArticleDetail detail = new ArticleDetail();
        detail.setId(id).setTitle(title).setSummary(summary).setContext(content).setAuthorId(1);
        boolean successFlag = articleManager.saveArticleDetail(detail);
        return assembleResponse(successFlag);
    }

    @GetMapping("/article/listArticleByType")
    public BaseResponse<PageData<ArticleDetailListVO>> listArticleByType(@RequestParam Integer typeId,
                                                                         @RequestParam Integer pageIndex,
                                                                         @RequestParam Integer pageSize) {
        List<ArticleDetailListVO> articleDetails = articleManager.listArticleByType(typeId, pageIndex, pageSize)
                .stream().map(articleDetail -> {
                    ArticleDetailListVO vo = new ArticleDetailListVO();
                    vo.setAuthorId(articleDetail.getAuthorId()).setId(articleDetail.getId())
                            .setOriginalFlag(articleDetail.getOriginalFlag()).setSummary(articleDetail.getSummary())
                            .setTitle(articleDetail.getTitle()).setType(articleDetail.getType()).setTypeId(articleDetail.getTypeId());
                    return vo;
                }).collect(Collectors.toList());
        int totalCount = articleManager.countArticleByType(typeId);
        return assemblePageResponse(articleDetails, totalCount, pageIndex, pageSize);
    }


    @GetMapping("/article/getAllArticleType")
    public BaseResponse<PageData<ArticleType>> getAllArticleType() {
        List<ArticleType> articleTypes = articleManager.getAllArticleType();
        return assemblePageResponse(articleTypes, 0, 0, 0);
    }
}
