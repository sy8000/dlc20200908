package cn.besbing.Service.Impl;

import cn.besbing.Dao.NcSampleInfoMapper;
import cn.besbing.Entities.NcSampleInfo;
import cn.besbing.Service.INcSampleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class INcSampleInfoServiceImpl implements INcSampleInfoService {

    @Autowired(required = false)
    NcSampleInfoMapper ncSampleInfoMapper;

    public int insert(NcSampleInfo ncSampleInfo){
        return ncSampleInfoMapper.insert(ncSampleInfo);
    }


}
