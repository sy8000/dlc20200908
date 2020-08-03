package cn.besbing.Dao;

import cn.besbing.Entities.NcTestlistComp;
import cn.besbing.Entities.NcTestlistCompExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NcTestlistCompMapper {
    long countByExample(NcTestlistCompExample example);

    int deleteByExample(NcTestlistCompExample example);

    int deleteByPrimaryKey(String pkTestlistComp);

    int insert(NcTestlistComp record);

    int insertSelective(NcTestlistComp record);

    List<NcTestlistComp> selectByExample(NcTestlistCompExample example);

    NcTestlistComp selectByPrimaryKey(String pkTestlistComp);

    int updateByExampleSelective(@Param("record") NcTestlistComp record, @Param("example") NcTestlistCompExample example);

    int updateByExample(@Param("record") NcTestlistComp record, @Param("example") NcTestlistCompExample example);

    int updateByPrimaryKeySelective(NcTestlistComp record);

    int updateByPrimaryKey(NcTestlistComp record);
}