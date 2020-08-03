package cn.besbing.Dao;

import cn.besbing.Entities.NcBasprodStruct;
import cn.besbing.Entities.NcBasprodStructExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NcBasprodStructMapper {
    long countByExample(NcBasprodStructExample example);

    int deleteByExample(NcBasprodStructExample example);

    int deleteByPrimaryKey(String pkBasprodStruct);

    int insert(NcBasprodStruct record);

    int insertSelective(NcBasprodStruct record);

    List<NcBasprodStruct> selectByExample(NcBasprodStructExample example);

    NcBasprodStruct selectByPrimaryKey(String pkBasprodStruct);

    int updateByExampleSelective(@Param("record") NcBasprodStruct record, @Param("example") NcBasprodStructExample example);

    int updateByExample(@Param("record") NcBasprodStruct record, @Param("example") NcBasprodStructExample example);

    int updateByPrimaryKeySelective(NcBasprodStruct record);

    int updateByPrimaryKey(NcBasprodStruct record);
}