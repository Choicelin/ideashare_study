package mini.ideashare.tlbb.base;//package red.lightblue.mall.base;
//
//
//
//public class Init {
//    public static void main(String[] args) {
//         MysqlJdbcConfig config = new MysqlJdbcConfig();
//         config.setUrl("115.28.167.227")
//                 .setDatabaseName("lightbluedev")
//                 .setUserName("lixiang")
//                 .setPassword("admin123");
//         IS_ProjectConfig projectConfig = new IS_ProjectConfig();
//         projectConfig.setModelName("Type").setPackageName("red.lightblue.admin");
//         MysqlTable table = IS_MySqlUtils.getTableInfo(config,"all_type");
//         System.out.println(IS_GenMapperUtils.generateModel(table));
//         System.out.println(IS_GenMapperUtils.generateResultMap(table,projectConfig));
//         System.out.println(IS_GenMapperUtils.generateQueryCondition(table));
//         System.out.println(IS_GenMapperUtils.generateBaseColumnList(table));
//         System.out.println(IS_GenMapperUtils.generateInsertSql(table,projectConfig));
//         System.out.println(IS_GenMapperUtils.generateUpdateSql(table,projectConfig));
//         System.out.println(IS_GenMapperUtils.generateSelectSql(table,projectConfig));
//         System.out.println(IS_GenMethodUtils.generateDao(projectConfig));
//    }
//}
