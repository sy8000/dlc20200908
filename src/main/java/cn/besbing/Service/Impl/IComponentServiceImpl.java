package cn.besbing.Service.Impl;

import cn.besbing.Dao.ComponentMapper;
import cn.besbing.Entities.Component;
import cn.besbing.Entities.ComponentDefKey;
import cn.besbing.Service.IComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IComponentServiceImpl implements IComponentService {

    @Autowired(required = false)
    ComponentMapper componentMapper;

    public List<Component> selectByTS(ComponentDefKey component){
        return componentMapper.selectByTS(component.getAnalysis(),component.getVersion());
    }

}
