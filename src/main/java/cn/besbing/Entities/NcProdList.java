package cn.besbing.Entities;

import java.math.BigDecimal;

public class NcProdList extends NcProdListKey {
    private String pkProdList;

    private String ncProdCode;

    private String ncProdName;

    private BigDecimal ncProdIsdisable;

    private String def1;

    private String def2;

    private String def3;

    private String def4;

    private String def5;

    private String ncProdDes;

    private String ncProdAlias;

    public String getPkProdList() {
        return pkProdList;
    }

    public void setPkProdList(String pkProdList) {
        this.pkProdList = pkProdList;
    }

    public String getNcProdCode() {
        return ncProdCode;
    }

    public void setNcProdCode(String ncProdCode) {
        this.ncProdCode = ncProdCode;
    }

    public String getNcProdName() {
        return ncProdName;
    }

    public void setNcProdName(String ncProdName) {
        this.ncProdName = ncProdName;
    }

    public BigDecimal getNcProdIsdisable() {
        return ncProdIsdisable;
    }

    public void setNcProdIsdisable(BigDecimal ncProdIsdisable) {
        this.ncProdIsdisable = ncProdIsdisable;
    }

    public String getDef1() {
        return def1;
    }

    public void setDef1(String def1) {
        this.def1 = def1;
    }

    public String getDef2() {
        return def2;
    }

    public void setDef2(String def2) {
        this.def2 = def2;
    }

    public String getDef3() {
        return def3;
    }

    public void setDef3(String def3) {
        this.def3 = def3;
    }

    public String getDef4() {
        return def4;
    }

    public void setDef4(String def4) {
        this.def4 = def4;
    }

    public String getDef5() {
        return def5;
    }

    public void setDef5(String def5) {
        this.def5 = def5;
    }

    public String getNcProdDes() {
        return ncProdDes;
    }

    public void setNcProdDes(String ncProdDes) {
        this.ncProdDes = ncProdDes;
    }

    public String getNcProdAlias() {
        return ncProdAlias;
    }

    public void setNcProdAlias(String ncProdAlias) {
        this.ncProdAlias = ncProdAlias;
    }
}