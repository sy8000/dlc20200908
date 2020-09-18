package cn.besbing.Service.Impl;

import cn.besbing.Dao.DataloaderAuditLogMapper;
import cn.besbing.Entities.DataloaderAuditLog;
import cn.besbing.Service.IDataLoaderLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataLoaderLogImpl implements IDataLoaderLog {

    @Autowired(required = false)
    DataloaderAuditLogMapper dataloaderAuditLogMapper;

    public int addDataLoaderLog(DataloaderAuditLog dataloaderAuditLog){
        return dataloaderAuditLogMapper.insert(dataloaderAuditLog);
    }



}
