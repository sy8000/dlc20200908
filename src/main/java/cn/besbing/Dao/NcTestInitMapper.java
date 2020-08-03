package cn.besbing.Dao;

import cn.besbing.Entities.NcTestInit;
import cn.besbing.Entities.NcTestInitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NcTestInitMapper {
    long countByExample(NcTestInitExample example);

    int deleteByExample(NcTestInitExample example);

    int deleteByPrimaryKey(String pkTestInit);

    int insert(NcTestInit record);

    int insertSelective(NcTestInit record);

    List<NcTestInit> selectByExample(NcTestInitExample example);

    NcTestInit selectByPrimaryKey(String pkTestInit);

    int updateByExampleSelective(@Param("record") NcTestInit record, @Param("example") NcTestInitExample example);

    int updateByExample(@Param("record") NcTestInit record, @Param("example") NcTestInitExample example);

    int updateByPrimaryKeySelective(NcTestInit record);

    int updateByPrimaryKey(NcTestInit record);
}