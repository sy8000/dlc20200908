package cn.besbing.Service.Impl;

import cn.besbing.Dao.NcAnalysisReportnameMapper;
import cn.besbing.Entities.NcAnalysisReportname;
import cn.besbing.Service.INcAnalysisReportnameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NcAnalysisReportnameServiceImpl implements INcAnalysisReportnameService {

    @Autowired(required = false)
    private NcAnalysisReportnameMapper ncAnalysisReportnameMapper;


    public int insertAndGetPrimary(NcAnalysisReportname ncAnalysisReportname){
        return ncAnalysisReportnameMapper.insertAndGetPrimary(ncAnalysisReportname);
    }

}
