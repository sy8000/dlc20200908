package cn.besbing.Dao;

import cn.besbing.Entities.NcComponentTable;
import cn.besbing.Entities.NcComponentTableExample;
import cn.besbing.Entities.NcComponentTableKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NcComponentTableMapper {
    long countByExample(NcComponentTableExample example);

    int deleteByExample(NcComponentTableExample example);

    int deleteByPrimaryKey(NcComponentTableKey key);

    int insert(NcComponentTable record);

    int insertSelective(NcComponentTable record);

    List<NcComponentTable> selectByExample(NcComponentTableExample example);

    NcComponentTable selectByPrimaryKey(NcComponentTableKey key);

    int updateByExampleSelective(@Param("record") NcComponentTable record, @Param("example") NcComponentTableExample example);

    int updateByExample(@Param("record") NcComponentTable record, @Param("example") NcComponentTableExample example);

    int updateByPrimaryKeySelective(NcComponentTable record);

    int updateByPrimaryKey(NcComponentTable record);
}