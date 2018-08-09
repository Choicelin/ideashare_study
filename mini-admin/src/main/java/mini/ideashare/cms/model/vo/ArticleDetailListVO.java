package mini.ideashare.cms.model.vo;

/**
 * @Author lixiang
 * @CreateTime 2018/6/8
 **/
public class ArticleDetailListVO {
    //自增主键
    private Long id;
    //标题
    private String title;
    //描述
    private String summary;
    //作者id
    private Integer authorId;
    //ContentType 1 markdown , 2 html
    private Integer type;
    // 是否是原创： 0 否 1 是。
    private Integer originalFlag;
    //类别ID
    private Integer typeId;

    public Long getId() {
        return id;
    }

    public ArticleDetailListVO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ArticleDetailListVO setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public ArticleDetailListVO setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public ArticleDetailListVO setAuthorId(Integer authorId) {
        this.authorId = authorId;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public ArticleDetailListVO setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getOriginalFlag() {
        return originalFlag;
    }

    public ArticleDetailListVO setOriginalFlag(Integer originalFlag) {
        this.originalFlag = originalFlag;
        return this;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public ArticleDetailListVO setTypeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }
}
