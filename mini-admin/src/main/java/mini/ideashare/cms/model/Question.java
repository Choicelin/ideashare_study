package mini.ideashare.cms.model;

import java.util.Date;

/**
 * @Author lixiang
 * @CreateTime 2018/9/1
 **/
public class Question {
    //自增id
    private Long id;
    //问题标题
    private String title;
    //问题分类id
    private Integer typeId;
    //问题内容
    private String content;
    //问题创建人
    private String creator;
    //问题创建时间
    private Date createTime;
    //问题访问量
    private Long pv;
    //问题喜欢数量
    private Long likeCount;

    public Long getId() {
        return id;
    }

    public Question setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public Question setTypeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Question setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Question setContent(String content) {
        this.content = content;
        return this;
    }

    public String getCreator() {
        return creator;
    }

    public Question setCreator(String creator) {
        this.creator = creator;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Question setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Long getPv() {
        return pv;
    }

    public Question setPv(Long pv) {
        this.pv = pv;
        return this;
    }

    public Long getLikeCount() {
        return likeCount;
    }

    public Question setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
        return this;
    }
}
