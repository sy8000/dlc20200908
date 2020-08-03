package cn.besbing.Service.Impl;

import cn.besbing.Dao.QcTaskHMapper;
import cn.besbing.Entities.QcTaskH;
import cn.besbing.Service.IQcTaskHService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IQcTaskHServiceImpl implements IQcTaskHService {

    @Autowired(required = false)
    QcTaskHMapper qcTaskHMapper;

    public QcTaskH selectTaskHByPk(String primaryKey){
        return qcTaskHMapper.selectByPrimaryKey(primaryKey);
    }

    public int updateTaskHB(QcTaskH qcTaskH){
        return qcTaskHMapper.updateByPrimaryKey(qcTaskH);
    }

}
