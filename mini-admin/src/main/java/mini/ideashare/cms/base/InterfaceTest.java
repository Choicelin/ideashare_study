package mini.ideashare.cms.base;

import com.alibaba.fastjson.JSON;
import mini.ideashare.cms.controller.AskController;
import tech.ideashare.model.IS_JavaDoc;
import tech.ideashare.utils.is_generate.IS_GenDocUtils;

import java.util.List;

/**
 * @Author lixiang
 * @CreateTime 2018/9/8
 **/
public class InterfaceTest {
    public static void main(String[] args) {
        List<IS_JavaDoc> is_javaDocs = IS_GenDocUtils.generateDocByReflect(AskController.class);
        System.out.println(JSON.toJSONString(is_javaDocs).replaceAll("\\\\",""));
    }
}
