package cn.besbing.Service.Impl;

import cn.besbing.Dao.NcTestInitMapper;
import cn.besbing.Entities.NcTestInit;
import cn.besbing.Service.INcTestInit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class INcTestInitImpl implements INcTestInit {

    @Autowired(required = false)
    NcTestInitMapper ncTestInitMapper;

    public int insert(NcTestInit ncTestInit){
        return ncTestInitMapper.insert(ncTestInit);
    }

}
