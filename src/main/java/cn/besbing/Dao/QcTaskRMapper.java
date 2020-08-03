package cn.besbing.Dao;

import cn.besbing.Entities.QcTaskR;
import cn.besbing.Entities.QcTaskRExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QcTaskRMapper {
    long countByExample(QcTaskRExample example);

    int deleteByExample(QcTaskRExample example);

    int deleteByPrimaryKey(String pkTaskR);

    int insert(QcTaskR record);

    int insertSelective(QcTaskR record);

    List<QcTaskR> selectByExample(QcTaskRExample example);

    QcTaskR selectByPrimaryKey(String pkTaskR);

    int updateByExampleSelective(@Param("record") QcTaskR record, @Param("example") QcTaskRExample example);

    int updateByExample(@Param("record") QcTaskR record, @Param("example") QcTaskRExample example);

    int updateByPrimaryKeySelective(QcTaskR record);

    int updateByPrimaryKey(QcTaskR record);
}