package cn.besbing.Service.Impl;

import cn.besbing.Dao.NcBasprodPointMapper;
import cn.besbing.Entities.NcBasprodPoint;
import cn.besbing.Service.INcBasprodPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class INcBasprodPointServiceImpl implements INcBasprodPointService {

    @Autowired(required = false)
    NcBasprodPointMapper ncBasprodPointMapper;

    public int insert(NcBasprodPoint ncBasprodPoint){
        return ncBasprodPointMapper.insert(ncBasprodPoint);
    }

}
