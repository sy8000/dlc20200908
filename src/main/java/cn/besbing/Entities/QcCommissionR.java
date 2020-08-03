package cn.besbing.Entities;

import java.math.BigDecimal;

public class QcCommissionR {
    private String pkCommissionR;

    private String rowno;

    private String analysisname;

    private String pkSamplegroup;

    private String pkComponent;

    private String pkValuetype;

    private String stdmaxvalue;

    private String stdminvalue;

    private String unitname;

    private String judgeflag;

    private String testflag;

    private String productstage;

    private String isautogeneration;

    private String pkCommissionB;

    private String ts;

    private BigDecimal dr;

    public String getPkCommissionR() {
        return pkCommissionR;
    }

    public void setPkCommissionR(String pkCommissionR) {
        this.pkCommissionR = pkCommissionR;
    }

    public String getRowno() {
        return rowno;
    }

    public void setRowno(String rowno) {
        this.rowno = rowno;
    }

    public String getAnalysisname() {
        return analysisname;
    }

    public void setAnalysisname(String analysisname) {
        this.analysisname = analysisname;
    }

    public String getPkSamplegroup() {
        return pkSamplegroup;
    }

    public void setPkSamplegroup(String pkSamplegroup) {
        this.pkSamplegroup = pkSamplegroup;
    }

    public String getPkComponent() {
        return pkComponent;
    }

    public void setPkComponent(String pkComponent) {
        this.pkComponent = pkComponent;
    }

    public String getPkValuetype() {
        return pkValuetype;
    }

    public void setPkValuetype(String pkValuetype) {
        this.pkValuetype = pkValuetype;
    }

    public String getStdmaxvalue() {
        return stdmaxvalue;
    }

    public void setStdmaxvalue(String stdmaxvalue) {
        this.stdmaxvalue = stdmaxvalue;
    }

    public String getStdminvalue() {
        return stdminvalue;
    }

    public void setStdminvalue(String stdminvalue) {
        this.stdminvalue = stdminvalue;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public String getJudgeflag() {
        return judgeflag;
    }

    public void setJudgeflag(String judgeflag) {
        this.judgeflag = judgeflag;
    }

    public String getTestflag() {
        return testflag;
    }

    public void setTestflag(String testflag) {
        this.testflag = testflag;
    }

    public String getProductstage() {
        return productstage;
    }

    public void setProductstage(String productstage) {
        this.productstage = productstage;
    }

    public String getIsautogeneration() {
        return isautogeneration;
    }

    public void setIsautogeneration(String isautogeneration) {
        this.isautogeneration = isautogeneration;
    }

    public String getPkCommissionB() {
        return pkCommissionB;
    }

    public void setPkCommissionB(String pkCommissionB) {
        this.pkCommissionB = pkCommissionB;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public BigDecimal getDr() {
        return dr;
    }

    public void setDr(BigDecimal dr) {
        this.dr = dr;
    }
}