package cn.besbing.Dao;

import cn.besbing.Entities.DataloaderAuditLog;
import cn.besbing.Entities.DataloaderAuditLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataloaderAuditLogMapper {
    long countByExample(DataloaderAuditLogExample example);

    int deleteByExample(DataloaderAuditLogExample example);

    int deleteByPrimaryKey(String pkAuditLog);

    int insert(DataloaderAuditLog record);

    int insertSelective(DataloaderAuditLog record);

    List<DataloaderAuditLog> selectByExample(DataloaderAuditLogExample example);

    DataloaderAuditLog selectByPrimaryKey(String pkAuditLog);

    int updateByExampleSelective(@Param("record") DataloaderAuditLog record, @Param("example") DataloaderAuditLogExample example);

    int updateByExample(@Param("record") DataloaderAuditLog record, @Param("example") DataloaderAuditLogExample example);

    int updateByPrimaryKeySelective(DataloaderAuditLog record);

    int updateByPrimaryKey(DataloaderAuditLog record);
}