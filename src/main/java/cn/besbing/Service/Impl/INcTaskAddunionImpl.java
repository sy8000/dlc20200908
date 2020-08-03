package cn.besbing.Service.Impl;

import cn.besbing.Dao.NcTaskAddunionMapper;
import cn.besbing.Entities.NcTaskAddunion;
import cn.besbing.Service.INcTaskAddunion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class INcTaskAddunionImpl implements INcTaskAddunion {

    @Autowired(required = false)
    NcTaskAddunionMapper ncTaskAddunionMapper;

    public int insert(NcTaskAddunion ncTaskAddunion){
        return ncTaskAddunionMapper.insert(ncTaskAddunion);
    }

}
