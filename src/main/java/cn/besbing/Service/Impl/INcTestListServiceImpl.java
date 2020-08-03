package cn.besbing.Service.Impl;

import cn.besbing.Dao.NcTestListMapper;
import cn.besbing.Entities.NcTestList;
import cn.besbing.Service.INcTestListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class INcTestListServiceImpl implements INcTestListService {

    @Autowired(required = false)
    NcTestListMapper ncTestListMapper;

    public int insert(NcTestList ncTestList){
        return ncTestListMapper.insert(ncTestList);
    }

}
