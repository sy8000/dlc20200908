package cn.besbing.Dao;

import cn.besbing.Entities.NcBasprodName;
import cn.besbing.Entities.NcBasprodNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NcBasprodNameMapper {
    long countByExample(NcBasprodNameExample example);

    int deleteByExample(NcBasprodNameExample example);

    int deleteByPrimaryKey(String pkBasprodName);

    int insert(NcBasprodName record);

    int insertSelective(NcBasprodName record);

    List<NcBasprodName> selectByExample(NcBasprodNameExample example);

    NcBasprodName selectByPrimaryKey(String pkBasprodName);

    int updateByExampleSelective(@Param("record") NcBasprodName record, @Param("example") NcBasprodNameExample example);

    int updateByExample(@Param("record") NcBasprodName record, @Param("example") NcBasprodNameExample example);

    int updateByPrimaryKeySelective(NcBasprodName record);

    int updateByPrimaryKey(NcBasprodName record);
}