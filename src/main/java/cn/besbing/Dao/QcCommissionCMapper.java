package cn.besbing.Dao;

import cn.besbing.Entities.QcCommissionC;
import cn.besbing.Entities.QcCommissionCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QcCommissionCMapper {
    long countByExample(QcCommissionCExample example);

    int deleteByExample(QcCommissionCExample example);

    int deleteByPrimaryKey(String pkCommissionC);

    int insert(QcCommissionC record);

    int insertSelective(QcCommissionC record);

    List<QcCommissionC> selectByExample(QcCommissionCExample example);

    QcCommissionC selectByPrimaryKey(String pkCommissionC);

    int updateByExampleSelective(@Param("record") QcCommissionC record, @Param("example") QcCommissionCExample example);

    int updateByExample(@Param("record") QcCommissionC record, @Param("example") QcCommissionCExample example);

    int updateByPrimaryKeySelective(QcCommissionC record);

    int updateByPrimaryKey(QcCommissionC record);
}