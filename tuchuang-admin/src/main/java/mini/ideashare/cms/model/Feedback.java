package mini.ideashare.cms.model;

import java.util.Date;

/**
 * @Author lixiang
 * @CreateTime 2018/6/29
 **/
public class Feedback {
    //自增主键
    private Integer id;
    //邮件
    private String email;
    //手机
    private String mobile;
    //反馈内容
    private String content;
    //创建时间
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public Feedback setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Feedback setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public Feedback setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Feedback setContent(String content) {
        this.content = content;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Feedback setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }
}
