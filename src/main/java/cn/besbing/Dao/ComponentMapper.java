package cn.besbing.Dao;

import cn.besbing.Entities.Component;
import cn.besbing.Entities.ComponentDefKey;
import cn.besbing.Entities.ComponentExample;
import cn.besbing.Entities.ComponentKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ComponentMapper {
    long countByExample(ComponentExample example);

    int deleteByExample(ComponentExample example);

    int deleteByPrimaryKey(ComponentKey key);

    int insert(Component record);

    int insertSelective(Component record);

    List<Component> selectByExample(ComponentExample example);

    List<Component> selectByTS(@Param("analysis") String analysis,@Param("version") Long version);

    Component selectByPrimaryKey(ComponentKey key);

    int updateByExampleSelective(@Param("record") Component record, @Param("example") ComponentExample example);

    int updateByExample(@Param("record") Component record, @Param("example") ComponentExample example);

    int updateByPrimaryKeySelective(Component record);

    int updateByPrimaryKey(Component record);


}