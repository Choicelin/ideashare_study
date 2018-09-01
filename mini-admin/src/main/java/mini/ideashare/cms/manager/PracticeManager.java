package mini.ideashare.cms.manager;


import mini.ideashare.cms.dao.PracticeDAO;
import mini.ideashare.cms.model.Practice;
import mini.ideashare.cms.model.qc.Page;
import mini.ideashare.cms.model.qc.PracticeQC;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @Author lixiang
 * @CreateTime 2018/8/9
 **/
@Component
public class PracticeManager {

    @Autowired
    private PracticeDAO practiceDAO;


    public List<Practice> listPracticeByType(Integer typeId, Integer pageIndex, Integer pageSize){
        PracticeQC qc = new PracticeQC();
        qc.setSortBy("id");
        qc.setSortType("desc");
        Page page = new Page(pageIndex, pageSize);
        qc.setMajorType(typeId).setPage(page);
        return practiceDAO.listPractice(qc);
    }

    public Integer countPracticeByType(Integer typeId){
        PracticeQC qc = new PracticeQC();
        qc.setMajorType(typeId);
        return  practiceDAO.countPractice(qc);
    }

    public Practice getPracticeDetail(Long id){
        PracticeQC qc = new PracticeQC();
        qc.setId(id);
        List<Practice> practiceList = practiceDAO.listPractice(qc);
        if(CollectionUtils.isNotEmpty(practiceList)){
            return practiceList.get(0);
        }else {
            return null;
        }
    }

    public boolean savePractice(Practice practice){
        if(null==practice.getId()){
            //如果id为空的话，那就是新增
            practice.setCreateTime(new Date());
            return practiceDAO.insertPractice(practice)>0;
        }else {
            //如果id不为空的话，那就是更新
            practice.setUpdateTime(new Date());
            return practiceDAO.updatePractice(practice)>0;
        }
    }

    public int updatePvAndLikeCount(Practice practice){
        return  practiceDAO.updatePvAndLikeCount(practice);
    }

}
