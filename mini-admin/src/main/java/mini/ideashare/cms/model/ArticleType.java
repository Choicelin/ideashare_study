package mini.ideashare.cms.model;

/**
 * @Author lixiang
 * @CreateTime 2018/8/25
 **/
public class ArticleType {

    //自增主健ID
    private Integer id;
    //列表类型描述
    private String lang;

    public Integer getId() {
        return id;
    }

    public ArticleType setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public ArticleType setLang(String lang) {
        this.lang = lang;
        return this;
    }
}
