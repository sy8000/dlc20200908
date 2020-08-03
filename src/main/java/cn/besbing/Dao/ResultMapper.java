package cn.besbing.Dao;

import cn.besbing.Entities.Result;
import cn.besbing.Entities.ResultDefKey;
import cn.besbing.Entities.ResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResultMapper {
    long countByExample(ResultExample example);

    Result selectByDefKey(Result result);

    int deleteByExample(ResultExample example);

    int deleteByPrimaryKey(Long resultNumber);

    int insert(Result record);

    int insertSelective(Result record);

    List<Result> selectByExample(ResultExample example);

    Result selectByPrimaryKey(Long resultNumber);

    int updateByExampleSelective(@Param("record") Result record, @Param("example") ResultExample example);

    int updateByExample(@Param("record") Result record, @Param("example") ResultExample example);

    int updateByPrimaryKeySelective(Result record);

    int updateByPrimaryKey(Result record);

    int updateByDefKey(Result result);
}