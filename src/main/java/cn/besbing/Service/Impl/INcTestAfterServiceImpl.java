package cn.besbing.Service.Impl;

import cn.besbing.Dao.NcTestAfterMapper;
import cn.besbing.Entities.NcTestAfter;
import cn.besbing.Service.INcTestAfterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class INcTestAfterServiceImpl implements INcTestAfterService {

    @Autowired(required = false)
    NcTestAfterMapper ncTestAfterMapper;

    public int insert(NcTestAfter ncTestAfter){
        return ncTestAfterMapper.insert(ncTestAfter);
    }

}
