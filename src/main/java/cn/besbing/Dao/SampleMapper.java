package cn.besbing.Dao;

import cn.besbing.Entities.Sample;
import cn.besbing.Entities.SampleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SampleMapper {
    long countByExample(SampleExample example);

    int deleteByExample(SampleExample example);

    int deleteByPrimaryKey(Long sampleNumber);

    int insert(Sample record);

    int insertSelective(Sample record);

    List<Sample> selectByExample(SampleExample example);

    Sample selectByPrimaryKey(Long sampleNumber);

    int updateByExampleSelective(@Param("record") Sample record, @Param("example") SampleExample example);

    int updateByExample(@Param("record") Sample record, @Param("example") SampleExample example);

    int updateByPrimaryKeySelective(Sample record);

    int updateByPrimaryKey(Sample record);
}