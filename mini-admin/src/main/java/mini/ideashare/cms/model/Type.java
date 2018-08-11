package mini.ideashare.cms.model;

public class Type {

    //自增主健ID
    private Long id;
    //列表类型描述
    private String typeName;
    //分类等级
    private Integer typeLevel;
    //上级ID
    private Long parentId;

    public Long getId() {
        return id;
    }

    public Type setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTypeName() {
        return typeName;
    }

    public Type setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    public Integer getTypeLevel() {
        return typeLevel;
    }

    public Type setTypeLevel(Integer typeLevel) {
        this.typeLevel = typeLevel;
        return this;
    }

    public Long getParentId() {
        return parentId;
    }

    public Type setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
}
