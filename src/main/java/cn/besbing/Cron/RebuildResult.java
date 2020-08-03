package cn.besbing.Cron;

import cn.besbing.CommonUtils.MaintainModel.SpringUtil;
import cn.besbing.Entities.Result;
import cn.besbing.Service.Impl.CustomerSqlServiceImpl;
import cn.besbing.Service.Impl.ResultServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class RebuildResult {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    private ResultServiceImpl resultService = SpringUtil.getBean(ResultServiceImpl.class);

    private CustomerSqlServiceImpl customerSqlService = SpringUtil.getBean(CustomerSqlServiceImpl.class);

    private String sql = "select distinct r.sample_number || ',' || r.test_number || ',' ||r.analysis from " +
            "result r where r.ts is not null and r.analysis not like '%企标%' and r.test_number in " +
            "(select t.test_number from r t where t.ts is not null and t.c_test_type = '测试结果')";

    /**
     * 清除NC写入Result表内的错误数据，根据component和模板写入新的数据
     */
    public void CancelOldResultAndRebuildNewResult(){
        //获取空resultNo
        int resultNo = getResultNumber(0);
        //首先获取result模板:project:A-200618-0091
        Result resultTemplate = resultService.getLimsExampleResult();
        Result resultInsert = null;
        //找出NC传入全部的单据sampleNo和testNo
        List<String> allResultCondition =  customerSqlService.selectAsList(sql);
        String conditionSplitArr[] = null;
        //遍历所有结果
        for (String l : allResultCondition){
            conditionSplitArr = l.split(",");

        }
    }

    public int getResultNumber(int resultNumber){
        //先查到空的起始result_number
        String rs = null;
        do{
            resultNumber++;
            rs = customerSqlService.selectOne("select 1 from result where result_number = " + resultNumber);
        }while (rs != null);

        return resultNumber;
    }


}
