package cn.besbing.Dao;

import cn.besbing.Entities.AnalysisTable;

import java.util.List;
import java.util.Map;

public interface CustomerSqlMapper {

    Integer insert(String statement);

    Integer delete(String statement);

    Integer update(String statement);

    List<Map<String, Object>> selectList(String statement);

    String selectOne(String statement);

    List<String> selectAsList(String statement);

    List<AnalysisTable> selectAsAnalysisTable(String statement);

    List<?> selectVector(String statement);

}
