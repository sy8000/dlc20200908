package cn.besbing.Dao;

import cn.besbing.Entities.CProjParaA;
import cn.besbing.Entities.CProjParaAExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CProjParaAMapper {
    long countByExample(CProjParaAExample example);

    int deleteByExample(CProjParaAExample example);

    int deleteByPrimaryKey(Long seqNum);

    int insert(CProjParaA record);

    int insertSelective(CProjParaA record);

    List<CProjParaA> selectByExample(CProjParaAExample example);

    CProjParaA selectByPrimaryKey(Long seqNum);

    int updateByExampleSelective(@Param("record") CProjParaA record, @Param("example") CProjParaAExample example);

    int updateByExample(@Param("record") CProjParaA record, @Param("example") CProjParaAExample example);

    int updateByPrimaryKeySelective(CProjParaA record);

    int updateByPrimaryKey(CProjParaA record);
}