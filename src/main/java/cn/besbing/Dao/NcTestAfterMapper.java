package cn.besbing.Dao;

import cn.besbing.Entities.NcTestAfter;
import cn.besbing.Entities.NcTestAfterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NcTestAfterMapper {
    long countByExample(NcTestAfterExample example);

    int deleteByExample(NcTestAfterExample example);

    int deleteByPrimaryKey(String pkTestAfter);

    int insert(NcTestAfter record);

    int insertSelective(NcTestAfter record);

    List<NcTestAfter> selectByExample(NcTestAfterExample example);

    NcTestAfter selectByPrimaryKey(String pkTestAfter);

    int updateByExampleSelective(@Param("record") NcTestAfter record, @Param("example") NcTestAfterExample example);

    int updateByExample(@Param("record") NcTestAfter record, @Param("example") NcTestAfterExample example);

    int updateByPrimaryKeySelective(NcTestAfter record);

    int updateByPrimaryKey(NcTestAfter record);
}