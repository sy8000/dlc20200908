package cn.besbing.Service.Impl;

import cn.besbing.Dao.NcBasprodNameMapper;
import cn.besbing.Entities.NcBasprodName;
import cn.besbing.Service.INcBaseprodNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NcBaseprodNameServiceImpl implements INcBaseprodNameService {

    @Autowired(required = false)
    NcBasprodNameMapper ncBasprodNameMapper;

    public int insert(NcBasprodName ncBasprodName){
        return ncBasprodNameMapper.insert(ncBasprodName);
    }

}
