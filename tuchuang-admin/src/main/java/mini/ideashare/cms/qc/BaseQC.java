package mini.ideashare.cms.qc;

import java.util.Date;

/**
 * Query Condition 查询条件， 用于数据库条件查询
 * @Author lixiang
 * @CreateTime 01/04/2018
 **/
public class BaseQC {
    //排序字段
    private String sortBy;
    // 排序类型
    private String sortType;
    // 分页条件
    private Page page;

    //创建时间
    private Date createTime;

    //更新时间
    private Date updateTime;

    public Date getCreateTime() {
        return createTime;
    }

    public BaseQC setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public BaseQC setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getSortBy() {
        return sortBy;
    }

    public BaseQC setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    public String getSortType() {
        return sortType;
    }

    public BaseQC setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }

    public Page getPage() {
        return page;
    }

    public BaseQC setPage(Page page) {
        this.page = page;
        return this;
    }
}
