package cn.besbing.Service.Impl;

import cn.besbing.Dao.CustomerSqlMapper;
import cn.besbing.Entities.AnalysisTable;
import cn.besbing.Service.ICustomerSqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CustomerSqlServiceImpl implements ICustomerSqlService {

    @Autowired(required = false)
    CustomerSqlMapper customerSqlMapper;


    @Override
    public Integer insert(String statement) {
        return customerSqlMapper.insert(statement);
    }

    @Override
    public Integer delete(String statement) {
        return customerSqlMapper.delete(statement);
    }

    @Override
    public Integer update(String statement) {
        return customerSqlMapper.update(statement);
    }

    @Override
    public List<Map<String, Object>> selectList(String statement) {
        return customerSqlMapper.selectList(statement);
    }

    @Override
    public String selectOne(String statement) {
        return customerSqlMapper.selectOne(statement);
    }

    @Override
    public List<String> selectAsList(String statement) {
        return customerSqlMapper.selectAsList(statement);
    }



    @Override
    public List<AnalysisTable> selectAsAnalysisTable(String statement) {
        return customerSqlMapper.selectAsAnalysisTable(statement);
    }

    @Override
    public List<?> selectVector(String statement) {
        return customerSqlMapper.selectVector(statement);
    }


}
