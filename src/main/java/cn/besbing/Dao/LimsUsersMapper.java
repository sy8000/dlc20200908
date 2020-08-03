package cn.besbing.Dao;

import cn.besbing.Entities.LimsUsers;
import cn.besbing.Entities.LimsUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LimsUsersMapper {
    long countByExample(LimsUsersExample example);

    int deleteByExample(LimsUsersExample example);

    int deleteByPrimaryKey(String userName);

    int insert(LimsUsers record);

    int insertSelective(LimsUsers record);

    List<LimsUsers> selectByExample(LimsUsersExample example);

    LimsUsers selectByPrimaryKey(String userName);

    int updateByExampleSelective(@Param("record") LimsUsers record, @Param("example") LimsUsersExample example);

    int updateByExample(@Param("record") LimsUsers record, @Param("example") LimsUsersExample example);

    int updateByPrimaryKeySelective(LimsUsers record);

    int updateByPrimaryKey(LimsUsers record);
}