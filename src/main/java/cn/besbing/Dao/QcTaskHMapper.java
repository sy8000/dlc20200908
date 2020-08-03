package cn.besbing.Dao;

import cn.besbing.Entities.QcTaskH;
import cn.besbing.Entities.QcTaskHExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QcTaskHMapper {
    long countByExample(QcTaskHExample example);

    int deleteByExample(QcTaskHExample example);

    int deleteByPrimaryKey(String pkTaskH);

    int insert(QcTaskH record);

    int insertSelective(QcTaskH record);

    List<QcTaskH> selectByExample(QcTaskHExample example);

    QcTaskH selectByPrimaryKey(String pkTaskH);

    int updateByExampleSelective(@Param("record") QcTaskH record, @Param("example") QcTaskHExample example);

    int updateByExample(@Param("record") QcTaskH record, @Param("example") QcTaskHExample example);

    int updateByPrimaryKeySelective(QcTaskH record);

    int updateByPrimaryKey(QcTaskH record);
}