package cn.besbing.Service;

import cn.besbing.Entities.AnalysisTable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface ICustomerSqlService {
    Integer insert(String statement);

    Integer delete(String statement);

    Integer update(String statement);

    List<Map<String, Object>> selectList(String statement);

    String selectOne(String statement);

    List<String> selectAsList(String statement);

    List<AnalysisTable> selectAsAnalysisTable(String statement);

    List<?> selectVector(String statement);
}
