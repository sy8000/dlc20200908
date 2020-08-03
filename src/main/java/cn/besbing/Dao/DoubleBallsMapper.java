package cn.besbing.Dao;

import cn.besbing.Entities.DoubleBalls;
import cn.besbing.Entities.DoubleBallsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoubleBallsMapper {
    long countByExample(DoubleBallsExample example);

    int deleteByExample(DoubleBallsExample example);

    int deleteByPrimaryKey(String openDate);

    int insert(DoubleBalls record);

    int insertSelective(DoubleBalls record);

    List<DoubleBalls> selectByExample(DoubleBallsExample example);

    DoubleBalls selectByPrimaryKey(String openDate);

    int updateByExampleSelective(@Param("record") DoubleBalls record, @Param("example") DoubleBallsExample example);

    int updateByExample(@Param("record") DoubleBalls record, @Param("example") DoubleBallsExample example);

    int updateByPrimaryKeySelective(DoubleBalls record);

    int updateByPrimaryKey(DoubleBalls record);
}