package mini.ideashare.cms.base;


import com.alibaba.fastjson.JSON;
import mini.ideashare.cms.model.User;
import tech.ideashare.model.generate_model.IS_InterfaceConfig;
import tech.ideashare.model.generate_model.IS_ProjectConfig;
import tech.ideashare.model.generate_model.MysqlJdbcConfig;
import tech.ideashare.model.generate_model.MysqlTable;
import tech.ideashare.utils.is_generate.IS_GenMapperUtils;
import tech.ideashare.utils.is_generate.IS_GenMethodUtils;
import tech.ideashare.utils.is_generate.IS_MySqlUtils;

import java.util.Date;

public class Init {
    public static void main(String[] args) {
         MysqlJdbcConfig config = new MysqlJdbcConfig();
         config.setUrl("39.107.126.5")
                 .setDatabaseName("mini-game-dev")
                 .setUserName("lixiang")
                 .setPassword("admin123");
         IS_ProjectConfig projectConfig = new IS_ProjectConfig();
         projectConfig.setModelName("User").setPackageName("mini.ideashare.cms");

         MysqlTable table = IS_MySqlUtils.getTableInfo(config,"users");
         System.out.println(IS_GenMapperUtils.generateModel(table));
         System.out.println(IS_GenMapperUtils.generateResultMap(table,projectConfig));
         System.out.println(IS_GenMapperUtils.generateQueryCondition(table));
         System.out.println(IS_GenMapperUtils.generateBaseColumnList(table));
         System.out.println(IS_GenMapperUtils.generateInsertSql(table,projectConfig));
         System.out.println(IS_GenMapperUtils.generateUpdateSql(table,projectConfig));
         System.out.println(IS_GenMapperUtils.generateSelectSql(table,projectConfig));
         System.out.println(IS_GenMethodUtils.generateDao(projectConfig));

         User user = new User();
         user.setUserName("lixiang").setOpenId("1223").setCreateTime(new Date());
         System.out.println(JSON.toJSONString(user));
    }
}
