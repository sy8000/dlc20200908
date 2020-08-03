package cn.besbing.Dao;

import cn.besbing.Entities.QcCommissionR;
import cn.besbing.Entities.QcCommissionRExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QcCommissionRMapper {
    long countByExample(QcCommissionRExample example);

    int deleteByExample(QcCommissionRExample example);

    int deleteByPrimaryKey(String pkCommissionR);

    int insert(QcCommissionR record);

    int insertSelective(QcCommissionR record);

    List<QcCommissionR> selectByExample(QcCommissionRExample example);

    QcCommissionR selectByPrimaryKey(String pkCommissionR);

    int updateByExampleSelective(@Param("record") QcCommissionR record, @Param("example") QcCommissionRExample example);

    int updateByExample(@Param("record") QcCommissionR record, @Param("example") QcCommissionRExample example);

    int updateByPrimaryKeySelective(QcCommissionR record);

    int updateByPrimaryKey(QcCommissionR record);
}