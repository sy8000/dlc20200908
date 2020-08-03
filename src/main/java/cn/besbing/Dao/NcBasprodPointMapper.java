package cn.besbing.Dao;

import cn.besbing.Entities.NcBasprodPoint;
import cn.besbing.Entities.NcBasprodPointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NcBasprodPointMapper {
    long countByExample(NcBasprodPointExample example);

    int deleteByExample(NcBasprodPointExample example);

    int deleteByPrimaryKey(String pkBasprodPoint);

    int insert(NcBasprodPoint record);

    int insertSelective(NcBasprodPoint record);

    List<NcBasprodPoint> selectByExample(NcBasprodPointExample example);

    NcBasprodPoint selectByPrimaryKey(String pkBasprodPoint);

    int updateByExampleSelective(@Param("record") NcBasprodPoint record, @Param("example") NcBasprodPointExample example);

    int updateByExample(@Param("record") NcBasprodPoint record, @Param("example") NcBasprodPointExample example);

    int updateByPrimaryKeySelective(NcBasprodPoint record);

    int updateByPrimaryKey(NcBasprodPoint record);
}