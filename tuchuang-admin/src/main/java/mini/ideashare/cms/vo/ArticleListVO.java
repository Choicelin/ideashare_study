package mini.ideashare.cms.vo;

/**
 * @Author lixiang
 * @CreateTime 2018/5/31
 **/
public class ArticleListVO {
    //自增主键
    private Integer id;
    //标题
    private String title;
    //描述
    private String summary;
    //作者id
    private Integer authorId;

    public Integer getId() {
        return id;
    }

    public ArticleListVO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ArticleListVO setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public ArticleListVO setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public ArticleListVO setAuthorId(Integer authorId) {
        this.authorId = authorId;
        return this;
    }
}
