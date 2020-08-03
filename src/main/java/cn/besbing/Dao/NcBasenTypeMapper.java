package cn.besbing.Dao;

import cn.besbing.Entities.NcBasenType;
import cn.besbing.Entities.NcBasenTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NcBasenTypeMapper {
    long countByExample(NcBasenTypeExample example);

    int deleteByExample(NcBasenTypeExample example);

    int deleteByPrimaryKey(String pkBasenType);

    int insert(NcBasenType record);

    int insertSelective(NcBasenType record);

    List<NcBasenType> selectByExample(NcBasenTypeExample example);

    NcBasenType selectByPrimaryKey(String pkBasenType);

    int updateByExampleSelective(@Param("record") NcBasenType record, @Param("example") NcBasenTypeExample example);

    int updateByExample(@Param("record") NcBasenType record, @Param("example") NcBasenTypeExample example);

    int updateByPrimaryKeySelective(NcBasenType record);

    int updateByPrimaryKey(NcBasenType record);
}