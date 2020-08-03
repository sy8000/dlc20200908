package cn.besbing.Dao;

import cn.besbing.Entities.CProjLoginSample;
import cn.besbing.Entities.CProjLoginSampleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CProjLoginSampleMapper {
    long countByExample(CProjLoginSampleExample example);

    int deleteByExample(CProjLoginSampleExample example);

    int deleteByPrimaryKey(Short seqNum);

    int insert(CProjLoginSample record);

    int insertSelective(CProjLoginSample record);

    List<CProjLoginSample> selectByExample(CProjLoginSampleExample example);

    CProjLoginSample selectByPrimaryKey(Short seqNum);

    List<CProjLoginSample> selectByProject(String project);

    int updateByExampleSelective(@Param("record") CProjLoginSample record, @Param("example") CProjLoginSampleExample example);

    int updateByExample(@Param("record") CProjLoginSample record, @Param("example") CProjLoginSampleExample example);

    int updateByPrimaryKeySelective(CProjLoginSample record);

    int updateByPrimaryKey(CProjLoginSample record);
}