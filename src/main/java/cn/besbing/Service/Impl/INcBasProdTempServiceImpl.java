package cn.besbing.Service.Impl;

import cn.besbing.Dao.NcBasprodTempMapper;
import cn.besbing.Entities.NcBasprodTemp;
import cn.besbing.Service.INcBasProdTempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class INcBasProdTempServiceImpl implements INcBasProdTempService {

    @Autowired(required = false)
    NcBasprodTempMapper ncBasprodTempMapper;


    public int insert(NcBasprodTemp ncBasprodTemp){
        return ncBasprodTempMapper.insert(ncBasprodTemp);
    }

}
