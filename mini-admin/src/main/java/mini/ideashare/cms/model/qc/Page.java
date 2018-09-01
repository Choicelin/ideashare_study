package mini.ideashare.cms.model.qc;

/**
 * 用于QC中对数据库的查询
 * 如果需要分页查询，那么就让QC继承这个类
 * @Author lixiang
 * @CreateTime 01/04/2018
 **/
public class Page {
    /**
     * 页码，第几页，从1起 【page】
     */
    private Integer pageIndex = 1;

    /**
     * 每页显示条数【rows】
     */
    private Integer pageSize = 50;

    /**
     * 起始行号 limit startIndex,pageSize
     */
    private Integer startIndex = 0;

    public Page(Integer pageIndex, Integer pageSize) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getStartIndex() {
        if (this.pageIndex != null && this.pageSize != null) {
            return (this.pageIndex - 1) * this.pageSize;
        }
        return startIndex;
    }
}
