package cn.besbing.Service.Impl;

import cn.besbing.Dao.QcTaskBMapper;
import cn.besbing.Entities.QcTaskB;
import cn.besbing.Service.ITaskBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ITaskBServiceImpl implements ITaskBService {

    @Autowired(required = false)
    QcTaskBMapper qcTaskBMapper;

    public List<QcTaskB> getTaskB(List<String> taskBPkList){
        List<QcTaskB> qcTaskBList = new ArrayList<>();
        for (String taskPk : taskBPkList){
            qcTaskBList.add(qcTaskBMapper.selectByPrimaryKey(taskPk));
        }
        return qcTaskBList;
    }

}
