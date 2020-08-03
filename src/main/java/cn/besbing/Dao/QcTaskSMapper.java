package cn.besbing.Dao;

import cn.besbing.Entities.QcTaskS;
import cn.besbing.Entities.QcTaskSExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QcTaskSMapper {
    long countByExample(QcTaskSExample example);

    int deleteByExample(QcTaskSExample example);

    int deleteByPrimaryKey(String pkTaskS);

    int insert(QcTaskS record);

    int insertSelective(QcTaskS record);

    List<QcTaskS> selectByExample(QcTaskSExample example);

    QcTaskS selectByPrimaryKey(String pkTaskS);

    int updateByExampleSelective(@Param("record") QcTaskS record, @Param("example") QcTaskSExample example);

    int updateByExample(@Param("record") QcTaskS record, @Param("example") QcTaskSExample example);

    int updateByPrimaryKeySelective(QcTaskS record);

    int updateByPrimaryKey(QcTaskS record);
}