package cn.besbing.CommonUtils.MaintainModel;

import cn.besbing.Service.Impl.CustomerSqlServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class LimsAnalysisUtil {

    @Autowired
    CustomerSqlServiceImpl customerSqlService;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public int insertAnalysis(String...analysisName){
        int insertFlag = -1;
        if (analysisName.length < 1){
            logger.info("暂时不支持无参数新增方法模板");
        }else {
            for (String analysis : analysisName){
                logger.info("开始新增方法模板：" + analysis + "......");
                try{
                    String ncAnalysisListSql = "insert into NC_ANALYSIS_LIST select substr(SYS_GUID(),1,20), " +
                            " b.name,b.version,RANK() over(order by b.name,b.version asc),b.name,1,b.c_test_condition,'','','','','' " +
                            " from (select distinct a.name,a.version,a.c_test_condition  from analysis a where a.removed = 'F' and " +
                            " a.active = 'T') b where  b.name like '"+ analysis +"'";
                    customerSqlService.insert(ncAnalysisListSql);
                }catch (Exception e){
                    logger.error("nc_analysis_list表新增失败");
                }
                try{
                    String ncTaskAddunionSql = "insert into NC_TASK_ADDUNION select substr(SYS_GUID(), 1, 20),RANK() " +
                            " over(order by un.name, un.order_number, un.description asc),un.Name," +
                            "         un.TEST_LIST," +
                            "         un.T_ANALYSIS_METHOD," +
                            "         un.REPORTED_NAME," +
                            "         un.ANALYSIS_TYPE," +
                            "         un.DESCRIPTION," +
                            "         un.NAME," +
                            "         un.C_ALLOWED_PROD_TYPE," +
                            "         un.C_B_PLAN," +
                            "         un.order_number," +
                            "         ''," +
                            "         ''," +
                            "         ''," +
                            "         ''," +
                            "         ''" +
                            "    from (select t.name AS TEST_LIST," +
                            "                 A.T_ANALYSIS_METHOD," +
                            "                 A.REPORTED_NAME," +
                            "                 A.ANALYSIS_TYPE," +
                            "                 A.DESCRIPTION," +
                            "                 A1.NAME," +
                            "                 A.C_ALLOWED_PROD_TYPE," +
                            "                 (case T.C_B_PLAN" +
                            "                   when 'T' then" +
                            "                    'T'" +
                            "                   else" +
                            "                    ''" +
                            "                 end) as C_B_PLAN," +
                            "                 t.order_number" +
                            "            from test_list_entry t, analysis a, analysis a1" +
                            "           where a.name = t.analysis" +
                            "             AND A.C_TEST_TYPE = '测试条件'" +
                            "             and t.version = a.version" +
                            "             and a.group_name <> 'ABANDON'" +
                            "             and a.active = 'T'" +
                            "             and a.name = a1.c_test_condition" +
                            "       and a.removed = 'F'" +
                            "          UNION" +
                            "          " +
                            "          select '_NA' AS TEST_LIST," +
                            "                 A.T_ANALYSIS_METHOD," +
                            "                 A.REPORTED_NAME," +
                            "                 A.ANALYSIS_TYPE," +
                            "                 A.DESCRIPTION," +
                            "                 A.NAME," +
                            "                 A.C_ALLOWED_PROD_TYPE," +
                            "                 ''," +
                            "                 999" +
                            "            from analysis a" +
                            "           where A.ACTIVE = 'T'" +
                            "             and a.group_name <> 'ABANDON'" +
                            "             AND A.C_TEST_TYPE = '测试结果'" +
                            "       and a.removed = 'F'" +
                            "           order by 1, 9) un where un.name like '"+ analysis +"'";
                    customerSqlService.insert(ncTaskAddunionSql);
                }catch (Exception e){
                    logger.error("NC_TASK_ADDUNION表新增失败");
                }
                try{
                    String ncComponentTableSql = "insert into NC_COMPONENT_TABLE      " +
                            "           select substr(SYS_GUID(), 1, 20), " +
                            "       (select nrt.pk_result_type" +
                            "          from nc_result_type nrt" +
                            "         where trim(nrt.nc_result_name) = trim(b.result_type))," +
                            "       (select nut.pk_units_type" +
                            "          from nc_units_type nut" +
                            "         where nut.unit_code = b.units)," +
                            "       (select nlt.pk_list_table" +
                            "          from nc_list_table nlt" +
                            "         where nlt.name = b.list_key)," +
                            "       RANK() over(order by b.analysis, b.name, b.version asc)," +
                            "       b.name," +
                            "       b.*" +
                            "  from (select distinct c.*" +
                            "          from component c, analysis a" +
                            "         where c.analysis = a.name" +
                            "           and a.removed = 'F'" +
                            "           and a.active = 'T'" +
                            "           and a.group_name = 'DEFAULT'" +
                            "           and a.version = (select max(version) from analysis where name = a.name)" +
                            "           and a.active = 'T'" +
                            "           and a.removed = 'F'" +
                            "           and c.version = (select max(version) from component where analysis = a.name)\n" +
                            "           and a.name  like '"+ analysis +"'" +
                            "           ) b";
                    customerSqlService.insert(ncComponentTableSql);
                }catch (Exception e){
                    logger.error("nc_component_table表新增失败");
                }
                insertFlag++;
                logger.info("结束新增方法模板：" + analysis + "......");
            }
        }
        return insertFlag;
    }

}
