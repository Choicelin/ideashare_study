package mini.ideashare.cms.model;

import java.util.Date;

/**
 * @Author lixiang
 * @CreateTime 2018/8/9
 **/
public class Practice {
    //自增主键
    private Long id;
    //公司名称
    private String companyName;
    //所在城市
    private String companyCity;
    //专业类别
    private Integer majorType;
    //工作名称
    private String jobTitle;
    //工作描述
    private String jobDesc;
    //工作要求
    private String jobRequire;
    //访问量
    private Long pv;
    //点赞数
    private Long likeCount;
    //发布人id，和user表关联
    private Long publisherId;
    //创建时间
    private Date createTime;
    //更新人
    private String updater;
    //更新时间
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public Practice setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Practice setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public Practice setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
        return this;
    }

    public Integer getMajorType() {
        return majorType;
    }

    public Practice setMajorType(Integer majorType) {
        this.majorType = majorType;
        return this;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public Practice setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public Practice setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
        return this;
    }

    public String getJobRequire() {
        return jobRequire;
    }

    public Practice setJobRequire(String jobRequire) {
        this.jobRequire = jobRequire;
        return this;
    }

    public Long getPublisherId() {
        return publisherId;
    }

    public Practice setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Practice setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getUpdater() {
        return updater;
    }

    public Practice setUpdater(String updater) {
        this.updater = updater;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Practice setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Long getPv() {
        return pv;
    }

    public Practice setPv(Long pv) {
        this.pv = pv;
        return this;
    }

    public Long getLikeCount() {
        return likeCount;
    }

    public Practice setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
        return this;
    }
}
