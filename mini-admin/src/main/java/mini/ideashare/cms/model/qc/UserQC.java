package mini.ideashare.cms.model.qc;

import java.util.Date;

/**
 * @Author lixiang
 * @CreateTime 2018/8/9
 **/
public class UserQC extends BaseQC {
    //自增id
    private Long id;
    //微信openId
    private String openId;
    //用户名
    private String userName;
    //密码
    private String password;
    //头像
    private String userImage;

    //最后一次登录时间
    private Date lastLoginTime;

    public Long getId() {
        return id;
    }

    public UserQC setId(Long id) {
        this.id = id;
        return this;
    }

    public String getOpenId() {
        return openId;
    }

    public UserQC setOpenId(String openId) {
        this.openId = openId;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public UserQC setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserQC setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getUserImage() {
        return userImage;
    }

    public UserQC setUserImage(String userImage) {
        this.userImage = userImage;
        return this;
    }


    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public UserQC setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
        return this;
    }
}
