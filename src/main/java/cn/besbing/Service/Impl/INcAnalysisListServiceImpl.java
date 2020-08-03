package cn.besbing.Service.Impl;

import cn.besbing.Dao.NcAnalysisListMapper;
import cn.besbing.Entities.NcAnalysisList;
import cn.besbing.Service.INcAnalysisListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class INcAnalysisListServiceImpl implements INcAnalysisListService {

    @Autowired(required = false)
    private NcAnalysisListMapper ncAnalysisListMapper;

    public List<NcAnalysisList> selectAllNcAnalysisList(){
        return ncAnalysisListMapper.selectByNothing();
    }

    public NcAnalysisList selectByAnalysisKey(NcAnalysisList ncAnalysisList){
        return ncAnalysisListMapper.selectByAnalysisKey(ncAnalysisList);
    }

}
