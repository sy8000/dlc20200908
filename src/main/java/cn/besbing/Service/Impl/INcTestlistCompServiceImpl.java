package cn.besbing.Service.Impl;

import cn.besbing.Dao.NcTestlistCompMapper;
import cn.besbing.Entities.NcTestlistComp;
import cn.besbing.Service.INcTestlistCompService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class INcTestlistCompServiceImpl implements INcTestlistCompService {

    @Autowired(required = false)
    NcTestlistCompMapper ncTestlistCompMapper;


    public int insert(NcTestlistComp ncTestlistComp){
        return ncTestlistCompMapper.insert(ncTestlistComp);
    }

}
