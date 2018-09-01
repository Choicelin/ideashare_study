package mini.ideashare.cms.model.qc;

public class FeedbackQC extends BaseQC{

    //自增主键
    private Integer id;
    //邮件
    private String email;
    //手机
    private String mobile;
    //反馈内容
    private String content;


    public Integer getId() {
        return id;
    }

    public FeedbackQC setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public FeedbackQC setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public FeedbackQC setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getContent() {
        return content;
    }

    public FeedbackQC setContent(String content) {
        this.content = content;
        return this;
    }
}
