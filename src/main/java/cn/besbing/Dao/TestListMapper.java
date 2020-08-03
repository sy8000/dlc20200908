package cn.besbing.Dao;

import cn.besbing.Entities.TestList;
import cn.besbing.Entities.TestListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestListMapper {
    long countByExample(TestListExample example);

    int deleteByExample(TestListExample example);

    int deleteByPrimaryKey(String name);

    int insert(TestList record);

    int insertSelective(TestList record);

    List<TestList> selectByExample(TestListExample example);

    TestList selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") TestList record, @Param("example") TestListExample example);

    int updateByExample(@Param("record") TestList record, @Param("example") TestListExample example);

    int updateByPrimaryKeySelective(TestList record);

    int updateByPrimaryKey(TestList record);
}