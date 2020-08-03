package cn.besbing;


import cn.besbing.Entities.NcProdList;
import cn.besbing.Entities.Product;
import cn.besbing.Service.Impl.CustomerSqlServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DloadercloudApplication.class)
public class TestTestList {

    private Logger logger = LoggerFactory.getLogger(TestTestList.class);

    @Autowired
    CustomerSqlServiceImpl customerSqlService;

    @Test
    public void resultCastVo(){

        NcProdList ncProdList = new NcProdList();
        //List<Map<String,Object>> list =  customerSqlService.selectList("select 'a' pk_prod_list ,'b','c','d','e','f','g','h','i','j','k','l','m' from dual ");
        /*
        for (Map<String,Object> map : list){
            logger.info(map.get("PK_PROD_LIST").toString());
        }
        */
        List<Map<String,Object>> list =  customerSqlService.selectList("select 'a' pk_prod_list ,'b','c','d','e','f','g','h','i','j','k','l','m' from dual ");
    }


    public String getExecuteSql(String modules, Product product){
        String sql = "";
        try{
            logger.info("开始获取模块语句,module:{}..............",modules);
            sql = customerSqlService.selectOne("select sql_text from sql_records where sql_code = '" + modules + "'");
            //语句替换
            /**
             * sheny : product.name
             * why   : product.version
             * shenycode : product.code
             * shenytestlist : product.testlist
             */
            sql = sql.replace("sheny",product.getName());
            sql = sql.replace("why",String.valueOf(product.getVersion()));
            sql = sql.replace("shenycode",product.getCode());
            sql = sql.replace("shenytestlist",product.getTestList());
            logger.info("结束获取模块语句,module:{}..............",modules);
        }catch (Exception e){
            logger.error("获取语句出错,modules:{},cause:{}",modules,e.getStackTrace());
        }
        return sql;
    }


}
