package mini.ideashare.cms.model;

import java.util.Date;

public class User {
    private Long id;
    private String openId;
    private String userName;
    private String userImage;
    private Date createTime;
    private Date lastLoginTime;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getOpenId() {
        return openId;
    }

    public User setOpenId(String openId) {
        this.openId = openId;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserImage() {
        return userImage;
    }

    public User setUserImage(String userImage) {
        this.userImage = userImage;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public User setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public User setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
        return this;
    }

    public User(Long id, String openId, String userName, String userImage, Date createTime, Date lastLoginTime) {
        this.id = id;
        this.openId = openId;
        this.userName = userName;
        this.userImage = userImage;
        this.createTime = createTime;
        this.lastLoginTime = lastLoginTime;
    }

    public User() {
    }
}
