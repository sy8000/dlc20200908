package cn.besbing.Conctrollers;


import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/limsflow")
public class LimsController {


    /**
     * 客户工作流界面审核跳转
     * @return
     */
    @RequestMapping(value = "/CustomerWorkFlow",method = RequestMethod.GET)
    @RequiresPermissions("lims:customer")
    public String CustomerWorkFlow(){
        return "pages/CustomerWorkFlow.html";
    }

    /**
     * 客户主管界面审核跳转
     * @return
     */
    @RequestMapping(value = "/CustomerManger",method = RequestMethod.GET)
    @RequiresPermissions("lims:CustomerManager")
    public String CustomerMangerApprove(){
        return "pages/CustomerManger.html";
    }

    /**
     * 技术主管界面审核跳转
     * @return
     */
    @RequestMapping(value = "/TechManger",method = RequestMethod.GET)
    @RequiresPermissions("lims:TechManager")
    public String TechMangerApprove(){
        return "pages/TechManger.html";
    }

    /**
     * 报价单界面管理跳转
     * @return
     */
    @RequestMapping(value = "/QuoteManager",method = RequestMethod.GET)
    @RequiresPermissions("lims:QuoteManager")
    public String QuoteManager(){
        return "pages/QuoteManager.html";
    }

    /**
     * 样品接收界面跳转
     * @return
     */
    @RequestMapping(value = "/SampleManager",method = RequestMethod.GET)
    public String SampleManager(){
        return "pages/SampleManager.html";
    }

    /**
     * 计划排程界面跳转
     * @return
     */
    @RequestMapping(value = "/PlanArrangementManager",method = RequestMethod.GET)
    public String PlanArrangementManager(){
        return "pages/PlanArrangementManager.html";
    }

    /**
     * 任务分配界面跳转
     * @return
     */
    @RequestMapping(value = "/TaskDistributionManager",method = RequestMethod.GET)
    public String TaskDistributionManager(){
        return "pages/TaskDistributionManager.html";
    }

    /**
     * 测试录入分配界面跳转
     * @return
     */
    @RequestMapping(value = "/AnalysisManager",method = RequestMethod.GET)
    public String AnalysisManager(){
        return "pages/AnalysisManager.html";
    }

    /**
     * 技术工程师界面跳转
     * @return
     */
    @RequestMapping(value = "/TechEngineerManager",method = RequestMethod.GET)
    public String TechEngineerManager(){
        return "pages/TechEngineerManager.html";
    }

    /**
     * 报告签发界面跳转
     * @return
     */
    @RequestMapping(value = "/ReportSignManager",method = RequestMethod.GET)
    public String ReportSignManager(){
        return "pages/ReportSignManager.html";
    }

    /**
     * 计费单界面跳转
     * @return
     */
    @RequestMapping(value = "/ChargeManager",method = RequestMethod.GET)
    public String ChargeManager(){
        return "pages/ChargeManager.html";
    }

}
