package cn.besbing.Service.Impl;

import cn.besbing.Dao.NcProdListMapper;
import cn.besbing.Entities.NcProdList;
import cn.besbing.Entities.NcProdListKey;
import cn.besbing.Service.INcProdListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class INcProdListServiceImpl implements INcProdListService {

    @Autowired(required = false)
    private NcProdListMapper ncProdListMapper;

    public NcProdList getNcProdListByPrimary(NcProdListKey key){
        return ncProdListMapper.selectByPrimaryKey(key);
    }


    public int insert(NcProdList ncProdList){
        return ncProdListMapper.insert(ncProdList);
    }
}
