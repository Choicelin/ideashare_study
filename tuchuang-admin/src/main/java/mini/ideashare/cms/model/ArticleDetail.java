package mini.ideashare.cms.model;

public class ArticleDetail {
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

    public Integer getId() {
        return id;
    }

    public ArticleDetail setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ArticleDetail setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContext() {
        return context;
    }

    public ArticleDetail setContext(String context) {
        this.context = context;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public ArticleDetail setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public ArticleDetail setAuthorId(Integer authorId) {
        this.authorId = authorId;
        return this;
    }
}
