package mini.ideashare.cms.model;

public class User {
    private Long id;
    private String openId;
    private String userName;
    private String userImage;
    private String createTime;
    private String lastLoginTime;

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

    public String getCreateTime() {
        return createTime;
    }

    public User setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public User setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
        return this;
    }

    public User(Long id, String openId, String userName, String userImage, String createTime, String lastLoginTime) {
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
