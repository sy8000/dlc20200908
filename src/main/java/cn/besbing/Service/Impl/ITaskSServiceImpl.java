package cn.besbing.Service.Impl;

import cn.besbing.Dao.QcTaskSMapper;
import cn.besbing.Entities.QcTaskS;
import cn.besbing.Service.ITaskSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ITaskSServiceImpl implements ITaskSService {

    @Autowired(required = false)
    QcTaskSMapper qcTaskSMapper;


    public List<QcTaskS> getTaskSByPk(List<String> taskSPkList){
        List<QcTaskS> taskSList = new ArrayList<>();
        for (String taskSPk : taskSPkList){
            taskSList.add(qcTaskSMapper.selectByPrimaryKey(taskSPk));
        }
        return taskSList;
    }

}
