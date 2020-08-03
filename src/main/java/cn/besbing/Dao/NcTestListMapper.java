package cn.besbing.Dao;

import cn.besbing.Entities.NcTestList;
import cn.besbing.Entities.NcTestListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NcTestListMapper {
    long countByExample(NcTestListExample example);

    int deleteByExample(NcTestListExample example);

    int deleteByPrimaryKey(String name);

    int insert(NcTestList record);

    int insertSelective(NcTestList record);

    List<NcTestList> selectByExample(NcTestListExample example);

    NcTestList selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") NcTestList record, @Param("example") NcTestListExample example);

    int updateByExample(@Param("record") NcTestList record, @Param("example") NcTestListExample example);

    int updateByPrimaryKeySelective(NcTestList record);

    int updateByPrimaryKey(NcTestList record);
}