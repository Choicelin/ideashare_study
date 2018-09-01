package mini.ideashare.cms.model.qc;

public class ArticleDetailQC extends BaseQC{
    //自增主键
    private Integer id;
    //标题
    private String title;
    //正文
    private String context;
    //描述
    private String summary;
    //作者id
    private Integer authorId;
    private Integer typeId;

    public Integer getTypeId() {
        return typeId;
    }

    public ArticleDetailQC setTypeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public ArticleDetailQC setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ArticleDetailQC setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContext() {
        return context;
    }

    public ArticleDetailQC setContext(String context) {
        this.context = context;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public ArticleDetailQC setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public ArticleDetailQC setAuthorId(Integer authorId) {
        this.authorId = authorId;
        return this;
    }
}
