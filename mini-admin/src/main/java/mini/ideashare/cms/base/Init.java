package mini.ideashare.cms.base;


import com.alibaba.fastjson.JSON;
import mini.ideashare.cms.model.User;
import utils.ideashare.model.generate_model.IS_MysqlJdbcConfig;
import utils.ideashare.model.generate_model.IS_MysqlTable;
import utils.ideashare.model.generate_model.IS_ProjectConfig;
import utils.ideashare.utils.is_generate.IS_GenMapperUtils;
import utils.ideashare.utils.is_generate.IS_MySqlUtils;

import java.util.Date;

public class Init {
    public static void main(String[] args) {
         IS_MysqlJdbcConfig config = new IS_MysqlJdbcConfig();
         config.setUrl("39.107.126.5")
                 .setDatabaseName("mini-game-dev")
                 .setUserName("lixiang")
                 .setPassword("admin123");
         IS_ProjectConfig projectConfig = new IS_ProjectConfig();
         projectConfig.setModelName("Question").setPackageName("mini.ideashare.cms");

         IS_MysqlTable table = IS_MySqlUtils.getTableInfo(config,"question");
         System.out.println(IS_GenMapperUtils.generateModel(table));
//         System.out.println(IS_GenMapperUtils.generateResultMap(table,projectConfig));
//         System.out.println(IS_GenMapperUtils.generateQueryCondition(table));
//         System.out.println(IS_GenMapperUtils.generateBaseColumnList(table));
//         System.out.println(IS_GenMapperUtils.generateInsertSql(table,projectConfig));
//         System.out.println(IS_GenMapperUtils.generateUpdateSql(table,projectConfig));
//         System.out.println(IS_GenMapperUtils.generateSelectSql(table,projectConfig));
//         System.out.println(IS_GenMethodUtils.generateDao(projectConfig));

//         User user = new User();
//         user.setUserName("lixiang").setPassword("1223");
//         System.out.println(JSON.toJSONString(user));
    }
}
