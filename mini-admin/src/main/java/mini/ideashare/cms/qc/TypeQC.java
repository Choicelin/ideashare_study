package mini.ideashare.cms.qc;

public class TypeQC extends BaseQC{

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

    public TypeQC setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTypeName() {
        return typeName;
    }

    public TypeQC setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    public Integer getTypeLevel() {
        return typeLevel;
    }

    public TypeQC setTypeLevel(Integer typeLevel) {
        this.typeLevel = typeLevel;
        return this;
    }

    public Long getParentId() {
        return parentId;
    }

    public TypeQC setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
}
