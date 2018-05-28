package mini.ideashare.cms.qc;

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
