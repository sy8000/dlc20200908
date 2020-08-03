package cn.besbing.Service.Impl;

import cn.besbing.Dao.AnalysisMapper;
import cn.besbing.Entities.Analysis;
import cn.besbing.Entities.AnalysisKey;
import cn.besbing.Entities.NcAnalysisList;
import cn.besbing.Service.IAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IAnalysisServiceImpl implements IAnalysisService {

    @Autowired(required = false)
    private AnalysisMapper analysisMapper;

    public Analysis selectAnalysisByPrimaryKey(AnalysisKey key){
        return analysisMapper.selectByPrimaryKey(key);
    }



    public List<Analysis> selectAnalysisByNothing(){
        return analysisMapper.selectByNothing();
    }



}
