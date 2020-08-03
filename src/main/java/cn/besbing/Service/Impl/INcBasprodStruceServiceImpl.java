package cn.besbing.Service.Impl;

import cn.besbing.Dao.NcBasprodStructMapper;
import cn.besbing.Entities.NcBasprodStruct;
import cn.besbing.Service.INcBasprodStruceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class INcBasprodStruceServiceImpl implements INcBasprodStruceService {

    @Autowired(required = false)
    NcBasprodStructMapper ncBasprodStructMapper;

    public int insert(NcBasprodStruct ncBasprodStruct){
        return ncBasprodStructMapper.insert(ncBasprodStruct);
    }

}
