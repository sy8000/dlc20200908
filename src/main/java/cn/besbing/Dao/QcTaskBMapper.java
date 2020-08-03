package cn.besbing.Dao;

import cn.besbing.Entities.QcTaskB;
import cn.besbing.Entities.QcTaskBExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QcTaskBMapper {
    long countByExample(QcTaskBExample example);

    int deleteByExample(QcTaskBExample example);

    int deleteByPrimaryKey(String pkTaskB);

    int insert(QcTaskB record);

    int insertSelective(QcTaskB record);

    List<QcTaskB> selectByExample(QcTaskBExample example);

    QcTaskB selectByPrimaryKey(String pkTaskB);

    int updateByExampleSelective(@Param("record") QcTaskB record, @Param("example") QcTaskBExample example);

    int updateByExample(@Param("record") QcTaskB record, @Param("example") QcTaskBExample example);

    int updateByPrimaryKeySelective(QcTaskB record);

    int updateByPrimaryKey(QcTaskB record);
}