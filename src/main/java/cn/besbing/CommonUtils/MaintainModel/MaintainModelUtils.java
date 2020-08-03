package cn.besbing.CommonUtils.MaintainModel;

import cn.besbing.Service.Impl.CustomerSqlServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

public class MaintainModelUtils {

    @Autowired
    CustomerSqlServiceImpl customerSqlService;

    public  Model getMaintainUIData(){
        Model model = null;
        //客户累计
        String creatorsSql = "select count(1) from (select distinct h.creator from qc_commission_h h where h.dr = 0)";
        String creatorsNum = customerSqlService.selectOne(creatorsSql);
        model.addAttribute("creators",creatorsNum);
        //web端委托单累计
        String webProjSql = "select count(1) from qc_commission_h h where h.dr = 0";
        String webProjNum = customerSqlService.selectOne(webProjSql);
        model.addAttribute("webProjNum",webProjNum);
        //web端任务单累计
        String webTaskSql = "select count(1) from qc_task_b b where b.dr = 0";
        String webTaskNum = customerSqlService.selectOne(webTaskSql);
        model.addAttribute("webTaskNum",webTaskNum);
        //labware传入统计
        String lwProjSql = "select count(1) from project p where p.ts is not null and p.closed = 'F' ";
        String lwTaskSql = "select count(1) from c_proj_task cpt where cpt.project in ";
        lwTaskSql += " (select p.name from project p where p.ts is not null and p.closed = 'F') " +
                "and upper(cpt.status) != 'X' ";

        String lwProjAndTaskNum = customerSqlService.selectOne(lwProjSql) + "/" + customerSqlService.selectOne(lwTaskSql);
        model.addAttribute("lwProjAndTaskNum",lwProjAndTaskNum);
        return model;
    }

}
