package cn.besbing.Conctrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/testdb")
    public Map testDB(){
        List<Map<String,Object>> maps = jdbcTemplate.queryForList("select * from lims_users where full_name = '沈洋'");
        Map<String,Object> map =  maps.get(0);
        return map;
    }
}
