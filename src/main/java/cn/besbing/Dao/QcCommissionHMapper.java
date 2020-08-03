package cn.besbing.Dao;

import cn.besbing.Entities.*;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

public interface QcCommissionHMapper {
    long countByExample(QcCommissionHExample example);

    int deleteByExample(QcCommissionHExample example);

    int deleteByPrimaryKey(String pkCommissionH);

    int insert(QcCommissionH record);

    int insertSelective(QcCommissionH record);

    List<QcCommissionH> selectByExample(QcCommissionHExample example);

    QcCommissionH selectByPrimaryKey(String pkCommissionH);

    int updateByExampleSelective(@Param("record") QcCommissionH record, @Param("example") QcCommissionHExample example);

    int updateByExample(@Param("record") QcCommissionH record, @Param("example") QcCommissionHExample example);

    int updateByPrimaryKeySelective(QcCommissionH record);

    int updateByPrimaryKey(QcCommissionH record);

    List<TechManagerEntity> selectForTechManager(@RequestParam(value = "project", required = false) String project);
}