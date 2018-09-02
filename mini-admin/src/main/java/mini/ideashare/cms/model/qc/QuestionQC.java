package mini.ideashare.cms.model.qc;

import java.util.Date;

/**
 * @Author lixiang
 * @CreateTime 2018/9/1
 **/
public class QuestionQC extends BaseQC {
    //自增id
    private Long id;
    //问题标题
    private String title;
    //问题分类id
    private Integer type;
    //问题内容
    private String content;
    //问题创建人
    private String creator;


    public Long getId() {
        return id;
    }

    public QuestionQC setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public QuestionQC setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public QuestionQC setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public QuestionQC setContent(String content) {
        this.content = content;
        return this;
    }

    public String getCreator() {
        return creator;
    }

    public QuestionQC setCreator(String creator) {
        this.creator = creator;
        return this;
    }
}
