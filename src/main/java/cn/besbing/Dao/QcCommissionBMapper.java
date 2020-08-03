package cn.besbing.Dao;

import cn.besbing.Entities.QcCommissionB;
import cn.besbing.Entities.QcCommissionBExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QcCommissionBMapper {
    long countByExample(QcCommissionBExample example);

    int deleteByExample(QcCommissionBExample example);

    int deleteByPrimaryKey(String pkCommissionB);

    int insert(QcCommissionB record);

    int insertSelective(QcCommissionB record);

    List<QcCommissionB> selectByExample(QcCommissionBExample example);

    QcCommissionB selectByPrimaryKey(String pkCommissionB);

    List<QcCommissionB> selectByProjectNumber(String pkCommissionH);

    int updateByExampleSelective(@Param("record") QcCommissionB record, @Param("example") QcCommissionBExample example);

    int updateByExample(@Param("record") QcCommissionB record, @Param("example") QcCommissionBExample example);

    int updateByPrimaryKeySelective(QcCommissionB record);

    int updateByPrimaryKey(QcCommissionB record);
}