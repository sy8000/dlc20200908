package cn.besbing.Dao;

import cn.besbing.Entities.NcBasprodContact;
import cn.besbing.Entities.NcBasprodContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NcBasprodContactMapper {
    long countByExample(NcBasprodContactExample example);

    int deleteByExample(NcBasprodContactExample example);

    int deleteByPrimaryKey(String pkBasprodContact);

    int insert(NcBasprodContact record);

    int insertSelective(NcBasprodContact record);

    List<NcBasprodContact> selectByExample(NcBasprodContactExample example);

    NcBasprodContact selectByPrimaryKey(String pkBasprodContact);

    int updateByExampleSelective(@Param("record") NcBasprodContact record, @Param("example") NcBasprodContactExample example);

    int updateByExample(@Param("record") NcBasprodContact record, @Param("example") NcBasprodContactExample example);

    int updateByPrimaryKeySelective(NcBasprodContact record);

    int updateByPrimaryKey(NcBasprodContact record);
}