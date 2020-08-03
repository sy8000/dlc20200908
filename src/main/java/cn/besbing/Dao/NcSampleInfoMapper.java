package cn.besbing.Dao;

import cn.besbing.Entities.NcSampleInfo;
import cn.besbing.Entities.NcSampleInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NcSampleInfoMapper {
    long countByExample(NcSampleInfoExample example);

    int deleteByExample(NcSampleInfoExample example);

    int deleteByPrimaryKey(String pkSampleInfo);

    int insert(NcSampleInfo record);

    int insertSelective(NcSampleInfo record);

    List<NcSampleInfo> selectByExample(NcSampleInfoExample example);

    NcSampleInfo selectByPrimaryKey(String pkSampleInfo);

    int updateByExampleSelective(@Param("record") NcSampleInfo record, @Param("example") NcSampleInfoExample example);

    int updateByExample(@Param("record") NcSampleInfo record, @Param("example") NcSampleInfoExample example);

    int updateByPrimaryKeySelective(NcSampleInfo record);

    int updateByPrimaryKey(NcSampleInfo record);
}