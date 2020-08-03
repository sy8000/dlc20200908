package cn.besbing.Dao;

import cn.besbing.Entities.NcAnalysisReportname;
import cn.besbing.Entities.NcAnalysisReportnameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NcAnalysisReportnameMapper {
    long countByExample(NcAnalysisReportnameExample example);

    int deleteByExample(NcAnalysisReportnameExample example);

    int deleteByPrimaryKey(String pkAnalysisReportname);

    int insert(NcAnalysisReportname record);

    int insertAndGetPrimary(NcAnalysisReportname record);

    int insertSelective(NcAnalysisReportname record);

    List<NcAnalysisReportname> selectByExample(NcAnalysisReportnameExample example);

    NcAnalysisReportname selectByPrimaryKey(String pkAnalysisReportname);

    int updateByExampleSelective(@Param("record") NcAnalysisReportname record, @Param("example") NcAnalysisReportnameExample example);

    int updateByExample(@Param("record") NcAnalysisReportname record, @Param("example") NcAnalysisReportnameExample example);

    int updateByPrimaryKeySelective(NcAnalysisReportname record);

    int updateByPrimaryKey(NcAnalysisReportname record);
}