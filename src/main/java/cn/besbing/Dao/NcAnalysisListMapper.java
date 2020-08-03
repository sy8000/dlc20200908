package cn.besbing.Dao;

import cn.besbing.Entities.NcAnalysisList;
import cn.besbing.Entities.NcAnalysisListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NcAnalysisListMapper {
    long countByExample(NcAnalysisListExample example);

    int deleteByExample(NcAnalysisListExample example);

    int deleteByPrimaryKey(String pkAnalysisList);

    int insert(NcAnalysisList record);

    int insertSelective(NcAnalysisList record);

    List<NcAnalysisList> selectByExample(NcAnalysisListExample example);

    List<NcAnalysisList> selectByNothing();

    NcAnalysisList selectByPrimaryKey(String pkAnalysisList);

    NcAnalysisList selectByAnalysisKey(NcAnalysisList ncAnalysisList);

    int updateByExampleSelective(@Param("record") NcAnalysisList record, @Param("example") NcAnalysisListExample example);

    int updateByExample(@Param("record") NcAnalysisList record, @Param("example") NcAnalysisListExample example);

    int updateByPrimaryKeySelective(NcAnalysisList record);

    int updateByPrimaryKey(NcAnalysisList record);
}