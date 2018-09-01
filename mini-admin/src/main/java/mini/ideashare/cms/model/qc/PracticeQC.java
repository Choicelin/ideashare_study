package mini.ideashare.cms.model.qc;

/**
 * @Author lixiang
 * @CreateTime 2018/8/9
 **/
public class PracticeQC extends BaseQC{
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
    //发布人id，和user表关联
    private Long publisherId;

    //更新人
    private String updater;


    public Long getId() {
        return id;
    }

    public PracticeQC setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Integer getMajorType() {
        return majorType;
    }

    public PracticeQC setMajorType(Integer majorType) {
        this.majorType = majorType;
        return this;
    }

    public PracticeQC setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public PracticeQC setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
        return this;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public PracticeQC setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public PracticeQC setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
        return this;
    }

    public String getJobRequire() {
        return jobRequire;
    }

    public PracticeQC setJobRequire(String jobRequire) {
        this.jobRequire = jobRequire;
        return this;
    }

    public Long getPublisherId() {
        return publisherId;
    }

    public PracticeQC setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
        return this;
    }



    public String getUpdater() {
        return updater;
    }

    public PracticeQC setUpdater(String updater) {
        this.updater = updater;
        return this;
    }


}
