package cn.besbing.Entities;

import java.math.BigDecimal;

public class QcTaskR {
    private String pkTaskR;

    private String pkSamplegroup;

    private BigDecimal stdminvalue;

    private BigDecimal stdmaxvalue;

    private String pkUnit;

    private String testflag;

    private String judgeflag;

    private String pkTesttemperature;

    private String analysisname;

    private String pkComponent;

    private String pkValuetype;

    private String pkTaskB;

    private String ts;

    private BigDecimal dr;

    public String getPkTaskR() {
        return pkTaskR;
    }

    public void setPkTaskR(String pkTaskR) {
        this.pkTaskR = pkTaskR;
    }

    public String getPkSamplegroup() {
        return pkSamplegroup;
    }

    public void setPkSamplegroup(String pkSamplegroup) {
        this.pkSamplegroup = pkSamplegroup;
    }

    public BigDecimal getStdminvalue() {
        return stdminvalue;
    }

    public void setStdminvalue(BigDecimal stdminvalue) {
        this.stdminvalue = stdminvalue;
    }

    public BigDecimal getStdmaxvalue() {
        return stdmaxvalue;
    }

    public void setStdmaxvalue(BigDecimal stdmaxvalue) {
        this.stdmaxvalue = stdmaxvalue;
    }

    public String getPkUnit() {
        return pkUnit;
    }

    public void setPkUnit(String pkUnit) {
        this.pkUnit = pkUnit;
    }

    public String getTestflag() {
        return testflag;
    }

    public void setTestflag(String testflag) {
        this.testflag = testflag;
    }

    public String getJudgeflag() {
        return judgeflag;
    }

    public void setJudgeflag(String judgeflag) {
        this.judgeflag = judgeflag;
    }

    public String getPkTesttemperature() {
        return pkTesttemperature;
    }

    public void setPkTesttemperature(String pkTesttemperature) {
        this.pkTesttemperature = pkTesttemperature;
    }

    public String getAnalysisname() {
        return analysisname;
    }

    public void setAnalysisname(String analysisname) {
        this.analysisname = analysisname;
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

    public String getPkTaskB() {
        return pkTaskB;
    }

    public void setPkTaskB(String pkTaskB) {
        this.pkTaskB = pkTaskB;
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