package cn.besbing.Dao;

import cn.besbing.Entities.AllTask;
import cn.besbing.Entities.AllTaskExample;
import java.util.List;

import cn.besbing.Entities.TableTaskFields;
import org.apache.ibatis.annotations.Param;

public interface AllTaskMapper {
    long countByExample(AllTaskExample example);

    int deleteByExample(AllTaskExample example);

    int insert(AllTask record);

    int insertSelective(AllTask record);

    List<AllTask> selectByExample(AllTaskExample example);

    int updateByExampleSelective(@Param("record") AllTask record, @Param("example") AllTaskExample example);

    int updateByExample(@Param("record") AllTask record, @Param("example") AllTaskExample example);

    List<TableTaskFields> selectForTable(String toString);
}