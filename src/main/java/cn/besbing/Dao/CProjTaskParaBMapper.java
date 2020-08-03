package cn.besbing.Dao;

import cn.besbing.Entities.CProjTaskParaB;
import cn.besbing.Entities.CProjTaskParaBExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CProjTaskParaBMapper {
    long countByExample(CProjTaskParaBExample example);

    int deleteByExample(CProjTaskParaBExample example);

    int deleteByPrimaryKey(Long seqNum);

    int insert(CProjTaskParaB record);

    int insertSelective(CProjTaskParaB record);

    List<CProjTaskParaB> selectByExample(CProjTaskParaBExample example);

    CProjTaskParaB selectByPrimaryKey(Long seqNum);

    int updateByExampleSelective(@Param("record") CProjTaskParaB record, @Param("example") CProjTaskParaBExample example);

    int updateByExample(@Param("record") CProjTaskParaB record, @Param("example") CProjTaskParaBExample example);

    int updateByPrimaryKeySelective(CProjTaskParaB record);

    int updateByPrimaryKey(CProjTaskParaB record);
}