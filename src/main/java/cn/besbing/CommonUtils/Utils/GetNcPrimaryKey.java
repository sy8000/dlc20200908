package cn.besbing.CommonUtils.Utils;


import cn.besbing.CommonUtils.MaintainModel.SpringUtil;
import cn.besbing.Entities.Analysis;
import cn.besbing.Entities.AnalysisKey;
import cn.besbing.Service.Impl.CustomerSqlServiceImpl;
import cn.besbing.Service.Impl.IAnalysisServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 工具类：
 * 主要功能为获取NC内各单的pk及list<pk>
 */
public class GetNcPrimaryKey {

    private CustomerSqlServiceImpl customerSqlService = SpringUtil.getBean(CustomerSqlServiceImpl.class);
    private IAnalysisServiceImpl analysisService = SpringUtil.getBean(IAnalysisServiceImpl.class);

    //取NC委托单表头主键
    public String getCommissionHPrimaryKey(String billno){
        return customerSqlService.selectOne("select pk_commission_h from qc_commission_h where " +
                "billno = '" + billno + "' and dr = 0");
    }

    //取NC委托单表体主键
    public List<String> getCommissionBPrimaryKey(String billno){
        return customerSqlService.selectAsList("select b.pk_commission_b from qc_commission_b b where b.dr = 0 " +
                " and b.pk_commission_h in (select h.pk_commission_h from qc_commission_h h where h.billno = '"+ billno +"' and h.dr = 0)");
    }

    //取委托单孙表试验前主键
    public List<String> getCommissionRPrimaryKey(String billno){
        return customerSqlService.selectAsList("select r.pk_commission_r from qc_commission_r r where r.pk_commission_b in (" +
                "select b.pk_commission_b from qc_commission_b b where b.dr = 0 and b.pk_commission_h in (select h.pk_commission_h " +
                " from qc_commission_h h where h.billno = '" + billno + "' and h.dr = 0)) and r.dr = 0");
    }

    //取任务单表头主键
    public String getTaskHPrimaryKey(String billno){
        return customerSqlService.selectOne("select pk_task_h  from qc_task_h where dr = 0 " +
                " and pk_commission_h = '" + getCommissionHPrimaryKey(billno) + "'");
    }

    //取任务单表体主键
    public List<String> getTaskBPrimaryKey(String billno){
        return customerSqlService.selectAsList("select pk_task_b from qc_task_b where dr = 0 " +
                "and pk_task_h = '" + getTaskHPrimaryKey(billno) + "'");
    }

    //取任务单孙表测试条件
    public List<String> getTaskSPrimaryKey(String billno){
        return customerSqlService.selectAsList("select s.pk_task_s from qc_task_s s where s.dr = 0 and s.pk_task_b in " +
                " (select b.pk_task_b from qc_task_b b where b.dr = 0 and b.pk_task_h = '" + getTaskHPrimaryKey(billno) + "')");
    }

    //取任务单孙表试验后参数
    public List<String> getTaskRPrimaryKey(String billno){
        return customerSqlService.selectAsList("select r.pk_task_r from qc_task_r r where r.dr = 0 and r.pk_task_b in " +
                " (select b.pk_task_b  from qc_task_b b where b.dr = 0 and b.pk_task_h = '" + getTaskHPrimaryKey(billno) + "')");
    }

    //委托单类型
    public String getProjectType(String projectTypePrimaryKey){
        return customerSqlService.selectOne("select trim(name) from nc_proj_type where trim(pk_proj_type) = '" + projectTypePrimaryKey + "'");
    }

    //所属公司、付费单位
    public String getCompany(String companyPrimaryKey){
        return customerSqlService.selectOne("select name from org_orgs where pk_org = '" + companyPrimaryKey + "'");
    }

    //查人员
    public String getSmuser(String cuserid){
        return customerSqlService.selectOne("select user_name from sm_user where cuserid = '" + cuserid + "'");
    }

    //样品总数
    public String getSampleTotal(String taskHPrimaryKey){
        return customerSqlService.selectOne("select sum(quantity) from qc_commission_b where pk_commission_h = '" + taskHPrimaryKey + "'");
    }


    //产品大类
    public String getProductType(String productType){
        return customerSqlService.selectOne("select trim(prod_type) from nc_first_type where pk_first_type = '" + productType + "'");
    }

    //产品二级分类
    public String getProductTypeSecond(String productType){
        return customerSqlService.selectOne("select trim(name) from nc_second_type where pk_second_type = '" + productType + "'");
    }

    //产品三级分类
    public String getProductTypeThird(String productType){
        if (productType == null){
            return "";
        }else {
            return customerSqlService.selectOne("select trim(nc_third_name) from nc_third_type where pk_third_type = '" + productType + "'");
        }
    }


    //试验后样品处理
    public String getSampleAfterTest(String sampleAfterTestPrimaryKey){
        return customerSqlService.selectOne("select trim(nc_ratain_name) from nc_ratain_handle where pk_ratain_handle = '" + sampleAfterTestPrimaryKey + "'");
    }

    //报告语言
    public String getReportLanguage(String reportLangPrimaryKey){
        return customerSqlService.selectOne("select lis_name from nc_report_lang where pk_report_lang='" + reportLangPrimaryKey  + "'");
    }

    //报告格式
    public String getReportFormat(String reportFormatPrimaryKey){
        return customerSqlService.selectOne("select trim(rp_report_name) from nc_report_type where pk_report_type = '" + reportFormatPrimaryKey + "'");
    }

    //认证类型
    public String getCertificationName(String CertificationPrimaryKey){
        return customerSqlService.selectOne("select trim(name) from nc_safe_type where pk_safe_type = '"+ transNullToNone(CertificationPrimaryKey) +"'");
    }

    //试验类型
    public String getIdentificationType(String identificationType){
        return customerSqlService.selectOne("select trim(nc_prodauth_name) from nc_prodauth_type where pk_prodauth_type = '"+ transNullToNone(identificationType) +"'");
    }

    //客户类型
    public String getCustomerType(String customerTypePrimaryKey){
        return customerSqlService.selectOne("select trim(nc_customer_name) from nc_customer_type where pk_customer_type = '"+ transNullToNone(customerTypePrimaryKey) +"'");
    }
    //测试需求
    public String getProductRequirement(String productRequirementPrimaryKey){
        return customerSqlService.selectOne("select trim(nc_testrequest_name) from nc_testrequest_type where pk_testrequest_name = '"+ transNullToNone(productRequirementPrimaryKey) +"'");
    }
    //检验性质
    public String getCheckingProperty(String checkingProperty){
        return customerSqlService.selectOne("select trim(nc_ratain_name) from nc_test_type where pk_ratain_handle = '"+ transNullToNone(checkingProperty) +"'");
    }


    /**********************************************************
     * 样品登记表
     * qc_mission.pk_productserial  ->  c_proj_login_sample.product_product_series
     * 产品系列
     */
    public String getproductSerial(String productSeriesPrimaryKey){
        return customerSqlService.selectOne("select trim(nc_basprodtype_name) from nc_basprod_type " +
                " where trim(pk_basprod_type) = '" + transNullToNone(productSeriesPrimaryKey) + "'");
    }
    /**
     * 企业标准
     * qc_mission.pk_enterprisestandard  ->  c_proj_login_sample.product_standard
     * **/
    public String getproductStandard(String pk_enterprisestandard){
        return customerSqlService.selectOne("select trim(nc_bbasen_name) from nc_basen_type " +
                " where trim(pk_basen_type) = '" + transNullToNone(pk_enterprisestandard) + "'");
    }
    /**
     * 规格号
     * qc_mission.pk_basprod_point  ->  c_proj_login_sample.production_spec
     * **/
    public String getproductSpec(String pk_basprod_point){
        return customerSqlService.selectOne("select trim(nc_basprodpoint_name) from " +
                " nc_basprod_point where trim(pk_basprod_point) = '" + transNullToNone(pk_basprod_point) + "'");
    }
    /**
     * 结构类型
     * qc_mission.pk_basprod_struct  ->  c_proj_login_sample.structure_type
     * **/
    public String getStruct(String pk_basprod_struct){
        return customerSqlService.selectOne("select trim(nc_basprodstruct_name) from " +
                " nc_basprod_struct where trim(pk_basprod_struct) = '" + transNullToNone(pk_basprod_struct) + "'");
    }
    /**
     * 样品组别
     * qc_mission.pk_samplegroup  ->  c_proj_login_sample.sample_group
     * **/
    public String getSampleGroup(String pk_sample_group){
        return customerSqlService.selectOne("select trim(nc_sample_name) from nc_sample_group where " +
                " trim(pk_sample_group) = '" + transNullToNone(pk_sample_group) + "'");
    }
    /**
     * 样品组别
     * qc_mission.pk_samplegroup  ->  c_proj_login_sample.sample_group
     * **/
    public String getSampleContactBrand(String pk_contact_brand){
        return customerSqlService.selectOne("select trim(nc_contact_name) from nc_contact_brand where " +
                " trim(pk_contact_brand) = '" + transNullToNone(pk_contact_brand) + "'");
    }

    /**
     * 任务表获取计划测试时间
     * 通过任务表子表去孙表取计算类型,如果没有则带0回去
     * **/
    public String getPlanTestTime(String pk_task_b){
        return customerSqlService.selectOne("select nvl(s.textvalue,0) from qc_task_s s where s.dr = 0 " +
                " and s.pk_valuetype = 'A1A3C72A854B7947E053' and s.pk_task_b = '" + pk_task_b + "' and rownum = 1");
    }

    /*
    *   获取任务单中测试条件的费用
     */
    public Map<String,Object> getAnalysisFee(String analysisName,int sampleQuantity,int planTestTime){
        Map<String,Object> feeMap = new HashMap<>();
        AnalysisKey analysisKey = new AnalysisKey();
        analysisKey.setName(analysisName);
        analysisKey.setVersion(Long.valueOf(customerSqlService.selectOne("select max(version) from analysis where name = '" + analysisName + "'")));
        Analysis analysis = analysisService.selectAnalysisByPrimaryKey(analysisKey);
        if (analysis != null){
            //a.c_charge_style1,a.c_charge_style2,a.c_base_fee1,a.c_base_fee2,a.c_test_unit_price1,a.c_test_unit_price2,a.c_max_num_batch,a.c_min_cycle
            if (analysis.getcChargeStyle1() == "T"){
                feeMap.put("c_base_fee",analysis.getcBaseFee1());
                feeMap.put("c_test_unit_price",analysis.getcTestUnitPrice1());
                feeMap.put("c_max_num_batch",analysis.getcMaxNumBatch());
                feeMap.put("c_min_cycle",analysis.getcMinCycle());
                feeMap.put("test_fee",(Double.valueOf(analysis.getcTestUnitPrice1()) * sampleQuantity));
                feeMap.put("total_charge",Double.valueOf(analysis.getcBaseFee1()) + (Double.valueOf(analysis.getcTestUnitPrice1()) * sampleQuantity));
            }
            if (analysis.getcChargeStyle2() == "T"){
                feeMap.put("c_base_fee",analysis.getcBaseFee2());
                feeMap.put("c_test_unit_price",analysis.getcTestUnitPrice2());
                feeMap.put("c_max_num_batch",analysis.getcMaxNumBatch());
                feeMap.put("c_min_cycle",analysis.getcMinCycle());
                feeMap.put("test_fee",sampleQuantity%Integer.valueOf(analysis.getcMaxNumBatch().toString()) == 0 ? Integer.valueOf(sampleQuantity%Integer.valueOf(analysis.getcMaxNumBatch().toString())) : Integer.valueOf(sampleQuantity%Integer.valueOf(analysis.getcMaxNumBatch().toString())) + 1);
                feeMap.put("total_charge",Double.valueOf(analysis.getcBaseFee2()) + ((Double.valueOf(analysis.getcTestUnitPrice2()) * planTestTime) * (sampleQuantity%Integer.valueOf(analysis.getcMaxNumBatch().toString()) == 0 ? Integer.valueOf(sampleQuantity%Integer.valueOf(analysis.getcMaxNumBatch().toString())) : Integer.valueOf(sampleQuantity%Integer.valueOf(analysis.getcMaxNumBatch().toString())) + 1)));
            }

        }
        return feeMap;
    }




    public String transNullToNone(String value){
        if (value == null){
            return "";
        }else {
            return value.trim();
        }
    }

}
