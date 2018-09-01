package mini.ideashare.cms.model;

import java.util.Date;

/**
 * @Author lixiang
 * @CreateTime 2018/9/1
 **/
public class Answer {
    //自增id
    private Long id;
    //上级回答id
    private Long parentId;
    //问题id
    private Long questionId;
    //回答内容
    private String content;
    //回答创建人
    private String creator;
    //回答创建时间
    private Date createTime;
    //回答更新时间
    private Date updateTime;
    //回答喜欢人数
    private Long likeCount;

    public Long getId() {
        return id;
    }

    public Answer setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getParentId() {
        return parentId;
    }

    public Answer setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public Answer setQuestionId(Long questionId) {
        this.questionId = questionId;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Answer setContent(String content) {
        this.content = content;
        return this;
    }

    public String getCreator() {
        return creator;
    }

    public Answer setCreator(String creator) {
        this.creator = creator;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Answer setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Answer setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Long getLikeCount() {
        return likeCount;
    }

    public Answer setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
        return this;
    }
}
