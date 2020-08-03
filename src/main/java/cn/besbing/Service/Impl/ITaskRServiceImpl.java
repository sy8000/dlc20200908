package cn.besbing.Service.Impl;

import cn.besbing.Dao.QcTaskRMapper;
import cn.besbing.Entities.QcTaskR;
import cn.besbing.Service.ITaskRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ITaskRServiceImpl implements ITaskRService {

    @Autowired(required = false)
    QcTaskRMapper qcTaskRMapper;

    public List<QcTaskR> getTaskRList(List<String> taskRPkList){
        List<QcTaskR> taskRList = new ArrayList<>();
        for (String taskRPk : taskRPkList){
            taskRList.add(qcTaskRMapper.selectByPrimaryKey(taskRPk));
        }
        return taskRList;
    }
}
