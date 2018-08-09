package mini.ideashare.cms.controller;

import mini.ideashare.cms.base.BaseResponse;
import mini.ideashare.cms.base.PageData;
import mini.ideashare.cms.manager.PracticeManager;
import mini.ideashare.cms.model.ArticleDetail;
import mini.ideashare.cms.model.Practice;
import mini.ideashare.cms.model.vo.ArticleDetailListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

        List<Practice> practiceList = practiceManager.listPracticeByType(typeId, pageIndex, pageSize);
        int totalCount = practiceManager.countPracticeByType(typeId);

        return assemblePageResponse(practiceList, totalCount, pageIndex, pageSize);
    }

    @GetMapping("/practice/getPracticeById")
    public BaseResponse<Practice> getPracticeById(@RequestParam Long id) {
        Practice practice = practiceManager.getPracticeDetail(id);
        return assembleResponse(practice);
    }


}
