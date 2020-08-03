package cn.besbing.CommonUtils.MaintainModel;

import cn.besbing.Entities.Result;
import cn.besbing.Entities.ResultDefKey;
import cn.besbing.Service.Impl.CustomerSqlServiceImpl;
import cn.besbing.Service.Impl.ResultServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

public class LimsResultOpration {


    private Logger logger = LoggerFactory.getLogger(UpdateLimsBillStatus.class);


    private ResultServiceImpl resultService = SpringUtil.getBean(ResultServiceImpl.class);

    private CustomerSqlServiceImpl customerSqlService = SpringUtil.getBean(CustomerSqlServiceImpl.class);

    /**
     * 拿到小垂的result结果，封装ResultThreePrimary实体，然后查询
     * 有：则update
     * 无：则insert
     * 返回ResultThreePrimary.toString()
     * @param
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public String paramProcessor(Result res){
        ResultDefKey resultDefKey = new ResultDefKey();
        resultDefKey.setName(res.getName());
        resultDefKey.setSampleNumber(res.getSampleNumber());
        resultDefKey.setTestNumber(res.getTestNumber());
        Result result = new Result();
        try{
            result = resultService.getResultByDefKey(res);
        }catch (Exception e){
            logger.error("getResultByDefKey出错{}",res.toString());
        }
        if("线圈电阻".equals(res.getName())){
                System.out.println();
        }
        //判断是否存在此条记录
        if (result != null){
            //有记录，更新

            result.setTestNumber(res.getTestNumber());
            result.setSampleNumber(res.getSampleNumber());
            result.setName(res.getName());
            result.setMinimum(res.getMinimum());
            result.setMaximum(res.getMaximum());
            result.setEntry(res.getEntry());
            result.setEnteredBy(res.getEnteredBy());
            result.setFormattedEntry(res.getFormattedEntry());
            result.setAnalysis(res.getAnalysis());
            //result.setUnits(res.getUnits());
            logger.warn("result_entry:" + result.getEntry());
            logger.warn("res_entry:" + res.getEntry());
            try {
                logger.info("开始更新{}的结果数据,class:{}",resultDefKey.toString(),this.getClass().getName());
                resultService.updateByPrimary(result);
                logger.info("更新完成{}的结果数据,class:{}",resultDefKey.toString(),this.getClass().getName());
            }catch (Exception e){
                logger.error("更新错误{}的结果数据,class:{}",resultDefKey.toString(),this.getClass().getName());
            }
        }else {
            //没记录，新增
            //记录时间
            Date ss = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String currentTime = formatter.format(ss.getTime());
            result = new Result();
            /**
             * sheny review 2020/6/6
             * 从0开始获取resultnumber
             */
            //Integer incMax_Result = Integer.valueOf(customerSqlService.selectOne("select value from increments s where s.type = 'RESULT'"));
            Integer actualMax_Result = 0;
            do {
                actualMax_Result++;
                result = resultService.getResultByPrimary(actualMax_Result.longValue());
            }while (result != null);
            /*Integer incMax_Result = Integer.valueOf(customerSqlService.selectOne("select value from increments s where s.type = 'RESULT'"));
            Integer actualMax_Result = Integer.valueOf(customerSqlService.selectOne("select max(result_number) from result"));
            Integer target_resultNumber = 0;
            if (actualMax_Result > incMax_Result){
                try{
                    logger.info("开始更新increments的resultnumber,result_number:{},class:{}",actualMax_Result+1,this.getClass().getName());
                    customerSqlService.update("update increments s set s.value = "+ actualMax_Result + 1 +" where type = 'RESULT'");
                    logger.info("完成更新increments的resultnumber,result_number:{},class:{}",actualMax_Result+1,this.getClass().getName());
                }catch (Exception e){
                    logger.error("更新increments的resultnumber出错,result_number:{},class:{},message:{}",actualMax_Result+1,this.getClass().getName(),e.getStackTrace());
                }
            }*/

            logger.info("==============================" + res.getTestNumber());
            //开始准备insert
            result = new Result();
            result.setTestNumber(res.getTestNumber());
            result.setSampleNumber(res.getSampleNumber());
            result.setName(res.getName());
            result.setReportedName(res.getName());
            result.setMinimum(res.getMinimum());
            result.setMaximum(res.getMaximum());
            result.setEntry(res.getEntry());
            result.setEnteredBy(res.getEnteredBy());
            result.setFormattedEntry(res.getFormattedEntry());
            result.setResultNumber(Long.valueOf(actualMax_Result));
            result.setAnalysis(res.getAnalysis());
            //result.setUnits(res.getUnits());    此处可能会出现空错误，所以暂时用空上传占位
            result.setUnits("");
            result.setReplicateCount(Long.valueOf(0));
            if ("温度".equals(res.getName())){
                result.setOrderNumber(Long.valueOf(1));
                result.setReportedName(res.getName());
                result.setNumericEntry(BigDecimal.valueOf(Long.parseLong(res.getEntry())));
                result.setUnits("DEGREE_C");
                result.settShortName("Temperature");
            }
            if ("湿度".equals(res.getName())){
                result.setOrderNumber(Long.valueOf(2));
                result.setReportedName(res.getName());
                result.setNumericEntry(BigDecimal.valueOf(Long.parseLong(res.getEntry())));
                result.setUnits("HUMIDITY");
                result.settShortName("Humidity");
            }
            //此处可能会出现问题，即与component表的类型不符，如果有需要，可以通过自定义去查一下，然后selectOne回来
            result.setResultType("T");
            result.setStatus("E");
            result.setOldStatus("N");
            result.setModifiedResult("F");
            result.setAllowOut("T");
            result.setRound("F");
            result.setPlaces(Long.valueOf(1));
            result.setInSpec("T");
            result.setPrimaryInSpec("T");
            result.setEnteredOn(new Date());
            result.setFirstEntryOn(new Date());
            result.setUsesInstrument("F");
            result.setUsesCodes("F");
            result.setInCal("F");
            result.setAutoCalc("T");
            result.setAllowCancel("F");
            result.setLinkSize(Long.valueOf(0));
            result.setReportable("T");
            result.setOptional("T");
            result.setCodeEntered("F");
            result.setChangedOn(new Date());
            result.setStdReagSample(Long.valueOf(0));
            result.setHasAttributes("F");
            result.setFactorValue("0");
            result.setEntryType("N");
            result.setInControl("T");
            result.setDisplayed("T");
            result.setSpecOverride("F");
            result.setPlaces2(Long.valueOf("0"));
            result.setReportedResult("F");
            result.setReportedRsltRev(Long.valueOf(0));
            result.setReportedRsltOos("F");
            result.settAccredited("F");


            logger.warn("result_entry:" + result.getEntry());
            logger.warn("res_entry:" + res.getEntry());
            try{
                logger.info("开始插入result_number为{}的记录,class:{}",actualMax_Result+1,this.getClass().getName());
                resultService.insertResult(result);
                logger.info("结束插入result_number为{}的记录,class:{}",actualMax_Result+1,this.getClass().getName());
            }catch (Exception e){
                logger.error("更新increments的resultnumber出错,result_number:{},class:{},message:{}",actualMax_Result+1,this.getClass().getName(),e.getStackTrace());
            }
        }
        if (result.getResultNumber() != null){
            return result.getResultNumber().toString();
        }else {
            return null;
        }

    }

}
