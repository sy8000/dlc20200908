package cn.besbing.Entities;

import java.math.BigDecimal;

public class QcCommissionC {
    private String pkCommissionC;

    private String rowno;

    private String modifier;

    private String modifiedtime;

    private String itemname;

    private String oldvalue;

    private String newvalue;

    private String pkCommissionH;

    private String ts;

    private BigDecimal dr;

    public String getPkCommissionC() {
        return pkCommissionC;
    }

    public void setPkCommissionC(String pkCommissionC) {
        this.pkCommissionC = pkCommissionC;
    }

    public String getRowno() {
        return rowno;
    }

    public void setRowno(String rowno) {
        this.rowno = rowno;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(String modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getOldvalue() {
        return oldvalue;
    }

    public void setOldvalue(String oldvalue) {
        this.oldvalue = oldvalue;
    }

    public String getNewvalue() {
        return newvalue;
    }

    public void setNewvalue(String newvalue) {
        this.newvalue = newvalue;
    }

    public String getPkCommissionH() {
        return pkCommissionH;
    }

    public void setPkCommissionH(String pkCommissionH) {
        this.pkCommissionH = pkCommissionH;
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