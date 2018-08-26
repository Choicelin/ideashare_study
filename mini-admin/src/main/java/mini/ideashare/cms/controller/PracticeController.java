package mini.ideashare.cms.controller;

import mini.ideashare.cms.base.BaseResponse;
import mini.ideashare.cms.base.PageData;
import mini.ideashare.cms.manager.PracticeManager;
import mini.ideashare.cms.model.ArticleDetail;
import mini.ideashare.cms.model.Practice;
import mini.ideashare.cms.model.vo.ArticleDetailListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author lixiang
 * @CreateTime 2018/8/9
 **/
@RestController
public class PracticeController extends AbstractBaseController {

    @Autowired
    private PracticeManager practiceManager;


    @GetMapping("/practice/listPracticeByType")
    public BaseResponse<PageData<Practice>> listPracticeByType(@RequestParam Integer typeId,
                                                              @RequestParam Integer pageIndex,
                                                              @RequestParam Integer pageSize) {

        if(typeId==0){
            //如果是0的话，就是不分类别，都一次性获取到
            typeId=null;
        }
        List<Practice> practiceList = practiceManager.listPracticeByType(typeId, pageIndex, pageSize);
        int totalCount = practiceManager.countPracticeByType(typeId);

        return assemblePageResponse(practiceList, totalCount, pageIndex, pageSize);
    }

    @GetMapping("/practice/getPracticeById")
    public BaseResponse<Practice> getPracticeById(@RequestParam Long id) {
        Practice practice = practiceManager.getPracticeDetail(id);
        Practice updatePractice = new Practice();
        updatePractice.setId(id).setPv(1L);

        practiceManager.updatePvAndLikeCount(updatePractice);
        return assembleResponse(practice);
    }

    @PostMapping("/practice/savePractice")
    public BaseResponse savePractice(@RequestBody Practice practice) {
        //发布人的信息拿不到，以后改从redis里面拿
        boolean successFlag = practiceManager.savePractice(practice);
        return assembleResponse(successFlag);
    }

}
