package cn.besbing.Dao;

import cn.besbing.Entities.NcTaskAddunion;
import cn.besbing.Entities.NcTaskAddunionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NcTaskAddunionMapper {
    long countByExample(NcTaskAddunionExample example);

    int deleteByExample(NcTaskAddunionExample example);

    int deleteByPrimaryKey(String pkTaskAddunion);

    int insert(NcTaskAddunion record);

    int insertSelective(NcTaskAddunion record);

    List<NcTaskAddunion> selectByExample(NcTaskAddunionExample example);

    NcTaskAddunion selectByPrimaryKey(String pkTaskAddunion);

    int updateByExampleSelective(@Param("record") NcTaskAddunion record, @Param("example") NcTaskAddunionExample example);

    int updateByExample(@Param("record") NcTaskAddunion record, @Param("example") NcTaskAddunionExample example);

    int updateByPrimaryKeySelective(NcTaskAddunion record);

    int updateByPrimaryKey(NcTaskAddunion record);
}