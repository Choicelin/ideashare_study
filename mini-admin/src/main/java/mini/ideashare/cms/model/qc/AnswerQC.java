package mini.ideashare.cms.model.qc;

/**
 * @Author lixiang
 * @CreateTime 2018/9/1
 **/
public class AnswerQC extends BaseQC {
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

    //回答喜欢人数
    private Long likeCount;

    public Long getId() {
        return id;
    }

    public AnswerQC setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getParentId() {
        return parentId;
    }

    public AnswerQC setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public AnswerQC setQuestionId(Long questionId) {
        this.questionId = questionId;
        return this;
    }

    public String getContent() {
        return content;
    }

    public AnswerQC setContent(String content) {
        this.content = content;
        return this;
    }

    public String getCreator() {
        return creator;
    }

    public AnswerQC setCreator(String creator) {
        this.creator = creator;
        return this;
    }



    public Long getLikeCount() {
        return likeCount;
    }

    public AnswerQC setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
        return this;
    }
}
