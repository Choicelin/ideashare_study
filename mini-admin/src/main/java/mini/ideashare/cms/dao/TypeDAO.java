package mini.ideashare.cms.dao;

import mini.ideashare.cms.model.Type;
import mini.ideashare.cms.model.qc.TypeQC;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TypeDAO {
    int insertType(Type type);
    List<Type> listType(TypeQC type);
    Integer countType(TypeQC type);
}
