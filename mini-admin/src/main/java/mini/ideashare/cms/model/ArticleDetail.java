package mini.ideashare.cms.model;

import java.util.Date;

public class ArticleDetail {
    //自增主键
    private Long id;
    //标题
    private String title;
    //正文
    private String context;
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

    //创建时间
    private Date createTime;

    //更新时间
    private Date updateTime;

    private Long pv;

    private Long likeCount;

    public Date getCreateTime() {
        return createTime;
    }

    public ArticleDetail setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public ArticleDetail setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public ArticleDetail setTypeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public ArticleDetail setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getOriginalFlag() {
        return originalFlag;
    }

    public ArticleDetail setOriginalFlag(Integer originalFlag) {
        this.originalFlag = originalFlag;
        return this;
    }

    public Long getId() {
        return id;
    }

    public ArticleDetail setId(Long id) {
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

    public Long getPv() {
        return pv;
    }

    public ArticleDetail setPv(Long pv) {
        this.pv = pv;
        return this;
    }

    public Long getLikeCount() {
        return likeCount;
    }

    public ArticleDetail setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
        return this;
    }
}
