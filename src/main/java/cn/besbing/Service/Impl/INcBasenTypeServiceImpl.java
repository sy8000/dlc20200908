package cn.besbing.Service.Impl;

import cn.besbing.Dao.NcBasenTypeMapper;
import cn.besbing.Dao.NcBasprodTypeMapper;
import cn.besbing.Entities.NcBasenType;
import cn.besbing.Entities.NcBasprodType;
import cn.besbing.Service.INcBasenTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class INcBasenTypeServiceImpl implements INcBasenTypeService {

    @Autowired(required = false)
    NcBasenTypeMapper ncBasenTypeMapper;

    public int insert(NcBasenType ncBasprodType){
        return ncBasenTypeMapper.insert(ncBasprodType);
    }

}
