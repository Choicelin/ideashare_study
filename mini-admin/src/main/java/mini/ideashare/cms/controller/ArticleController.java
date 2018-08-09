package mini.ideashare.cms.controller;

import mini.ideashare.cms.base.BaseResponse;
import mini.ideashare.cms.base.PageData;
import mini.ideashare.cms.manager.ArticleManager;
import mini.ideashare.cms.model.ArticleDetail;
import mini.ideashare.cms.model.ArticleType;
import mini.ideashare.cms.model.vo.ArticleDetailListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
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

    ExecutorService service2 = Executors.newCachedThreadPool();


    @GetMapping("/article/getArticleDetailById")
    public BaseResponse<ArticleDetail> getArticleDetail(@RequestParam Integer id) {
        ArticleDetail articleDetail = articleManager.getArticleDetailById(id);
        return assembleResponse(articleDetail);
    }

    @GetMapping("/article/testThread")
    public BaseResponse<ArticleDetail> testThread() {

        ExecutorService service = Executors.newCachedThreadPool();
        System.out.println("inner method   "+service);

        System.out.println("inner class   "+service2);
        return assembleResponse(null);
    }

    @PostMapping("/article/saveArticleDetail")
    public BaseResponse saveArticleDetail(@RequestBody ArticleDetail detail) {
        //需要考虑下怎么从session里面拿用户信息

        detail.setAuthorId(1);
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

    /**
     * 上传文件的接口
     * @param file 文件
     * @return
     */
    @PostMapping("/utils/uploadImage")
    public BaseResponse<Map> uploadImage(@RequestParam("file") MultipartFile file) {

        FileOutputStream outputStream = null;
        try {
            String path = "/home/files/fenxiangtech/images/";
            String fileName = path + file.getOriginalFilename();
            File file1 = new File(fileName);
            outputStream = new FileOutputStream(file1);
            outputStream.write(file.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
            return assembleResponse(null, false);
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Map<String , String >  map  =new HashMap<>();
        map.put("info","http://r.fenxiangtech.com/images/"+file.getOriginalFilename());
        return assembleResponse(map, true);
    }
}
