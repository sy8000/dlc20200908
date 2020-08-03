package cn.besbing.CommonUtils.MaintainModel;

import cn.besbing.Dao.CustomerSqlMapper;
import cn.besbing.Entities.CProjTask;
import cn.besbing.Service.ICustomerSqlService;
import cn.besbing.Service.Impl.CustomerSqlServiceImpl;
import cn.besbing.Service.Impl.TaskInfoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.List;

@Component
public class UpdateLimsBillStatus {

    private Logger logger = LoggerFactory.getLogger(UpdateLimsBillStatus.class);


    private CustomerSqlServiceImpl customerSqlService = SpringUtil.getBean(CustomerSqlServiceImpl.class);

    /**
     * 委托单刷关闭为打开
     * @param projName 委托单号
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public int writeDbProject(String projName){
        return customerSqlService.update("update project p set p.closed = 'F' where p.name = '" + projName + "'");
    }


    /**
     *
     * @param taskId
     * @param changeType
     * changeType:sample/plan/distribution/testing/engineer/report/taskend
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public int writeDbTaskStatus(String taskId,String changeType){
        int status = 0;
        List<String> taskList = new ArrayList<>();
        TaskInfoServiceImpl taskInfoService = SpringUtil.getBean(TaskInfoServiceImpl.class);
        //委托单和计划，是对委托单下所有任务进行修改
        if("sample".equals(changeType) || "plan".equals(changeType)){
            try{
                taskList = customerSqlService.selectAsList("select task_id from c_proj_task where project = '" + taskId + "'");
                if (taskList.size() > 0){
                    for (String task : taskList){
                        try{
                            logger.info("开始查找更改的任务单..." + this.getClass().getName());
                            CProjTask cProjTask = taskInfoService.getTaskEntityById(task);
                            logger.info("开始更改的任务单标志位..." + this.getClass().getName());
                            if ("sample".equals(changeType)){
                                cProjTask.setcSamplereceiveBy(null);
                                cProjTask.setcSamplereceiveDate(null);
                            }
                            cProjTask.setcArrangementBy(null);
                            cProjTask.setcArrangementDate(null);
                            cProjTask.setcMonitorprocessBy(null);
                            cProjTask.setcMonitorprocessDate(null);
                            cProjTask.setcAnalystStartBy(null);
                            cProjTask.setcAnalystStartDate(null);
                            cProjTask.setcAnalystSubmitBy(null);
                            cProjTask.setcAnalystSubmitDate(null);
                            cProjTask.setcTechengineerCreateBy(null);
                            cProjTask.setcTechengineerCreateDate(null);
                            cProjTask.setcTechengineerSubmitBy(null);
                            cProjTask.setcTechengineerSubmitDate(null);
                            cProjTask.setcReportcreateBy(null);
                            cProjTask.setcReportcreateDate(null);
                            cProjTask.setcReportsignatureBy(null);
                            cProjTask.setcReportsignatureDate(null);
                            cProjTask.setcChargecreateBy(null);
                            cProjTask.setcChargecreateDate(null);
                            cProjTask.setcChargesendBy(null);
                            cProjTask.setcChargesendDate(null);
                            cProjTask.setcChargesignatureBy(null);
                            cProjTask.setcChargesignatureDate(null);
                            status = taskInfoService.setTaskStatusById(cProjTask);
                        }catch (Exception e){
                            logger.error("查找更改的任务单出错{}..." + this.getClass().getName(),taskId);
                        }
                    }
                }
            }catch(Exception e){
                logger.error("通过委托单查找任务单出错{}..." + this.getClass().getName(),taskId);
            }
        }else {
            //除样品管理员、排程之外的其它跳转，转来的都是taskid,distribution/testing/engineer/report/taskend
            CProjTask cProjTask = taskInfoService.getTaskEntityById(taskId);
            if ("distribution".equals(changeType)){
                //任务分配
                cProjTask.setcMonitorprocessBy(null);
                cProjTask.setcMonitorprocessDate(null);
                cProjTask.setcAnalystStartBy(null);
                cProjTask.setcAnalystStartDate(null);
                cProjTask.setcAnalystSubmitBy(null);
                cProjTask.setcAnalystSubmitDate(null);
                cProjTask.setcTechengineerCreateBy(null);
                cProjTask.setcTechengineerCreateDate(null);
                cProjTask.setcTechengineerSubmitBy(null);
                cProjTask.setcTechengineerSubmitDate(null);
                cProjTask.setcReportcreateBy(null);
                cProjTask.setcReportcreateDate(null);
                cProjTask.setcReportsignatureBy(null);
                cProjTask.setcReportsignatureDate(null);
                cProjTask.setcChargecreateBy(null);
                cProjTask.setcChargecreateDate(null);
                cProjTask.setcChargesendBy(null);
                cProjTask.setcChargesendDate(null);
                cProjTask.setcChargesignatureBy(null);
                cProjTask.setcChargesignatureDate(null);
                status = taskInfoService.setTaskStatusById(cProjTask);
            }
            if ("testing".equals(changeType)){
                //测试中
                cProjTask.setcAnalystStartBy(null);
                cProjTask.setcAnalystStartDate(null);
                cProjTask.setcAnalystSubmitBy(null);
                cProjTask.setcAnalystSubmitDate(null);
                cProjTask.setcTechengineerCreateBy(null);
                cProjTask.setcTechengineerCreateDate(null);
                cProjTask.setcTechengineerSubmitBy(null);
                cProjTask.setcTechengineerSubmitDate(null);
                cProjTask.setcReportcreateBy(null);
                cProjTask.setcReportcreateDate(null);
                cProjTask.setcReportsignatureBy(null);
                cProjTask.setcReportsignatureDate(null);
                cProjTask.setcChargecreateBy(null);
                cProjTask.setcChargecreateDate(null);
                cProjTask.setcChargesendBy(null);
                cProjTask.setcChargesendDate(null);
                cProjTask.setcChargesignatureBy(null);
                cProjTask.setcChargesignatureDate(null);
                status = taskInfoService.setTaskStatusById(cProjTask);
            }
            if ("engineer".equals(changeType)){
                //技术工程师
                cProjTask.setcTechengineerCreateBy(null);
                cProjTask.setcTechengineerCreateDate(null);
                cProjTask.setcTechengineerSubmitBy(null);
                cProjTask.setcTechengineerSubmitDate(null);
                cProjTask.setcReportcreateBy(null);
                cProjTask.setcReportcreateDate(null);
                cProjTask.setcReportsignatureBy(null);
                cProjTask.setcReportsignatureDate(null);
                cProjTask.setcChargecreateBy(null);
                cProjTask.setcChargecreateDate(null);
                cProjTask.setcChargesendBy(null);
                cProjTask.setcChargesendDate(null);
                cProjTask.setcChargesignatureBy(null);
                cProjTask.setcChargesignatureDate(null);
                status = taskInfoService.setTaskStatusById(cProjTask);
            }
            if ("report".equals(changeType)){
                //报告签发
                cProjTask.setcReportcreateBy(null);
                cProjTask.setcReportcreateDate(null);
                cProjTask.setcReportsignatureBy(null);
                cProjTask.setcReportsignatureDate(null);
                cProjTask.setcChargecreateBy(null);
                cProjTask.setcChargecreateDate(null);
                cProjTask.setcChargesendBy(null);
                cProjTask.setcChargesendDate(null);
                cProjTask.setcChargesignatureBy(null);
                cProjTask.setcChargesignatureDate(null);
                status = taskInfoService.setTaskStatusById(cProjTask);
            }
            if ("taskend".equals(changeType)){
                //任务取消
                status = customerSqlService.update("update c_proj_task set status = 'F' where task_id = '" + taskId + "'");
            }
        }

     return  status;
    }

    /**
     * 流程跳转至样品管理员
     * @param projectList
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public int moveToSampleMgr(List<String> projectList){
        int flag = 0;
        //CustomerSqlServiceImpl customerSqlService = SpringUtil.getBean(CustomerSqlServiceImpl.class);
        List<String> sqlList = new ArrayList();
        try{
            sqlList = customerSqlService.selectAsList("select sql_text from sql_records where sql_code like 'sample%' ");
            logger.info("《跳转至样品管理员》获取sql_records完成");
        }catch(Exception e){
            logger.error("《跳转至样品管理员》获取sql_records表内容出错,sql:{}",sqlList);
        }
        for (String projName : projectList){
            logger.info("开始处理名称为{}的委托单，跳转至样品管理员处......",projName);
            for (String sql : sqlList){
                try{
                    flag += customerSqlService.update(sql.replace("sheny",projName));
                }catch (Exception e){
                    logger.error("处理名称为{}的委托单跳转至样品管理员时出错,sql{}......",projName,sql.replace("sheny",projName));
                }
            }
            //无论什么状态，都将委托单刷回closed='F'的状态
            flag += writeDbProject(projName);
            flag += writeDbTaskStatus(projName,"sample");
            logger.info("结束处理名称为{}的委托单，跳转至样品管理员处......",projName);
        }
        //全部完成后开始执行单据联查的标志位修改工作，此方法抽出去

        return flag;
    }

    /**
     * 计划排程
     * @param projectList
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public int moveToPlan(List<String> projectList){
        int flag = 0;
        //先清除排程表所有相关数据，然后对test t, sample s, project p三张表分别处理
        List<String> sqlList = new ArrayList();
        try{
            sqlList = customerSqlService.selectAsList("select sql_text from sql_records where sql_code like 'plan%' ");
            logger.info("《跳转至计划排程》获取sql_records完成");
        }catch(Exception e){
            logger.error("《跳转至计划排程》获取sql_records表内容出错,sql:{}",sqlList);
        }
        for (String projName : projectList){
            logger.info("开始处理名称为{}的委托单，跳转至计划排程处......",projName);
            for (String sql : sqlList){
                try{
                    flag += customerSqlService.update(sql.replace("sheny",projName));
                }catch (Exception e){
                    logger.error("处理名称为{}的委托单跳转至计划排程出错,sql{}......",projName,sql.replace("sheny",projName));
                }
            }
            //无论什么状态，都将委托单刷回closed='F'的状态
            flag += writeDbProject(projName);
            flag += writeDbTaskStatus(projName,"plan");
            logger.info("结束处理名称为{}的委托单，跳转至计划排程处......",projName);
        }
        //全部完成后开始执行单据联查的标志位修改工作，此方法抽出去

        return flag;
    }

    /**
     * 通用方法，处理除样品管理员和计划排程年所有任务单转转
     * @return
     *
     * description:首先判断入参jumpTo（值：distribution/testing/engineer/report/taskend），
     * 根据各模块进行个性化更新（即取出相应sql_records中相应的语句并执行）
     * 最后去执行通用标志位刷新方法
     */
    @Transactional(rollbackFor = Exception.class)
    public int moveToLimsStempGenaral(List<String> taskList , String jumpTo){
        int flag = 0;
        List<String> sqlList = new ArrayList();
        try{
            sqlList = customerSqlService.selectAsList("select sql_text from sql_records where sql_code like '" + jumpTo + "%' ");
            logger.info("《跳转至{}》获取sql_records完成",jumpTo);
        }catch(Exception e){
            logger.error("《跳转至{}》获取sql_records表内容出错,sql:{}",jumpTo,sqlList);
        }
        for (String taskId : taskList){
            logger.info("开始处理名称为{}的任务......",jumpTo);
            for (String sql : sqlList){
                try{
                    flag += customerSqlService.update(sql.replace("sheny",taskId));
                }catch (Exception e){
                    logger.error("处理名称为{}的{}出错,sql{}......",taskId,jumpTo,sql.replace("sheny",taskId));
                }
            }
            //无论什么状态，都将委托单刷回closed='F'的状态
            flag += writeDbProject(taskId.substring(0,13));
            flag += writeDbTaskStatus(taskId,jumpTo);
            logger.info("结束处理名称为{}的任务单......",taskId);
        }

        return flag;
    }


}
