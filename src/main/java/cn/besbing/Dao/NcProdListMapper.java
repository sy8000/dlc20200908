package cn.besbing.Dao;

import cn.besbing.Entities.NcProdList;
import cn.besbing.Entities.NcProdListExample;
import cn.besbing.Entities.NcProdListKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NcProdListMapper {
    long countByExample(NcProdListExample example);

    int deleteByExample(NcProdListExample example);

    int deleteByPrimaryKey(NcProdListKey key);

    int insert(NcProdList record);

    int insertSelective(NcProdList record);

    List<NcProdList> selectByExample(NcProdListExample example);

    NcProdList selectByPrimaryKey(NcProdListKey key);

    int updateByExampleSelective(@Param("record") NcProdList record, @Param("example") NcProdListExample example);

    int updateByExample(@Param("record") NcProdList record, @Param("example") NcProdListExample example);

    int updateByPrimaryKeySelective(NcProdList record);

    int updateByPrimaryKey(NcProdList record);
}