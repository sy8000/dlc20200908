package cn.besbing.Dao;

import cn.besbing.Entities.NcBasprodType;
import cn.besbing.Entities.NcBasprodTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NcBasprodTypeMapper {
    long countByExample(NcBasprodTypeExample example);

    int deleteByExample(NcBasprodTypeExample example);

    int deleteByPrimaryKey(String pkBasprodType);

    int insert(NcBasprodType record);

    int insertSelective(NcBasprodType record);

    List<NcBasprodType> selectByExample(NcBasprodTypeExample example);

    NcBasprodType selectByPrimaryKey(String pkBasprodType);

    int updateByExampleSelective(@Param("record") NcBasprodType record, @Param("example") NcBasprodTypeExample example);

    int updateByExample(@Param("record") NcBasprodType record, @Param("example") NcBasprodTypeExample example);

    int updateByPrimaryKeySelective(NcBasprodType record);

    int updateByPrimaryKey(NcBasprodType record);
}