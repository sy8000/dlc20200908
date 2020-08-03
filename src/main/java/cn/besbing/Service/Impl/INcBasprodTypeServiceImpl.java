package cn.besbing.Service.Impl;

import cn.besbing.Dao.NcBasprodTypeMapper;
import cn.besbing.Entities.NcBasprodType;
import cn.besbing.Service.INcBasprodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class INcBasprodTypeServiceImpl implements INcBasprodTypeService {

    @Autowired(required = false)
    NcBasprodTypeMapper ncBasprodTypeMapper;

    public int insert(NcBasprodType ncBasprodType){
        return ncBasprodTypeMapper.insert(ncBasprodType);
    }

}
