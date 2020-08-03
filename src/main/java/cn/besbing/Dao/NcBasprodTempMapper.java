package cn.besbing.Dao;

import cn.besbing.Entities.NcBasprodTemp;
import cn.besbing.Entities.NcBasprodTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NcBasprodTempMapper {
    long countByExample(NcBasprodTempExample example);

    int deleteByExample(NcBasprodTempExample example);

    int insert(NcBasprodTemp record);

    int insertSelective(NcBasprodTemp record);

    List<NcBasprodTemp> selectByExample(NcBasprodTempExample example);

    int updateByExampleSelective(@Param("record") NcBasprodTemp record, @Param("example") NcBasprodTempExample example);

    int updateByExample(@Param("record") NcBasprodTemp record, @Param("example") NcBasprodTempExample example);
}