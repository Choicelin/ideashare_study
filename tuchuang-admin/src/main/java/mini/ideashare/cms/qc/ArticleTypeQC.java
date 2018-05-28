package mini.ideashare.cms.qc;

public class ArticleTypeQC extends BaseQC{

    //自增主健ID
    private Integer id;
    //列表类型描述
    private String lang;

    public Integer getId() {
        return id;
    }

    public ArticleTypeQC setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public ArticleTypeQC setLang(String lang) {
        this.lang = lang;
        return this;
    }
}
