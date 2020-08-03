package cn.besbing.Dao;

import cn.besbing.Entities.DlRole;
import cn.besbing.Entities.DlRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DlRoleMapper {
    long countByExample(DlRoleExample example);

    int deleteByExample(DlRoleExample example);

    int deleteByPrimaryKey(String roleid);

    int insert(DlRole record);

    int insertSelective(DlRole record);

    List<DlRole> selectByExample(DlRoleExample example);

    DlRole selectByPrimaryKey(String roleid);

    int updateByExampleSelective(@Param("record") DlRole record, @Param("example") DlRoleExample example);

    int updateByExample(@Param("record") DlRole record, @Param("example") DlRoleExample example);

    int updateByPrimaryKeySelective(DlRole record);

    int updateByPrimaryKey(DlRole record);

    List<DlRole> findRoleByUsername(@Param("usercode") String usercode);
}