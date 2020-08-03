package cn.besbing.Service.Impl;

import cn.besbing.Dao.NcComponentTableMapper;
import cn.besbing.Entities.NcComponentTable;
import cn.besbing.Entities.NcComponentTableKey;
import cn.besbing.Service.INcComponentTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class INcComponentTableImpl implements INcComponentTable {

    @Autowired(required = false)
    NcComponentTableMapper ncComponentTableMapper;


    public NcComponentTable getNcComponentTableByPrimaryKey(NcComponentTableKey ncComponentTableKey){
        return ncComponentTableMapper.selectByPrimaryKey(ncComponentTableKey);
    }


}
