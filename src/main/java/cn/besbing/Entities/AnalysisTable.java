package cn.besbing.Entities;

public class AnalysisTable {
    String name;
    int version;
    String active;
    String analysis_type;
    String description;
    String changed_on;
    String changed_by;
    String removed;
    String t_analysis_method;
    String c_method_chapter;
    String c_test_type;
    String c_allowed_prod_type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getAnalysis_type() {
        return analysis_type;
    }

    public void setAnalysis_type(String analysis_type) {
        this.analysis_type = analysis_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChanged_on() {
        return changed_on;
    }

    public void setChanged_on(String changed_on) {
        this.changed_on = changed_on;
    }

    public String getChanged_by() {
        return changed_by;
    }

    public void setChanged_by(String changed_by) {
        this.changed_by = changed_by;
    }

    public String getRemoved() {
        return removed;
    }

    public void setRemoved(String removed) {
        this.removed = removed;
    }

    public String getT_analysis_method() {
        return t_analysis_method;
    }

    public void setT_analysis_method(String t_analysis_method) {
        this.t_analysis_method = t_analysis_method;
    }

    public String getC_method_chapter() {
        return c_method_chapter;
    }

    public void setC_method_chapter(String c_method_chapter) {
        this.c_method_chapter = c_method_chapter;
    }

    public String getC_test_type() {
        return c_test_type;
    }

    public void setC_test_type(String c_test_type) {
        this.c_test_type = c_test_type;
    }

    public String getC_allowed_prod_type() {
        return c_allowed_prod_type;
    }

    public void setC_allowed_prod_type(String c_allowed_prod_type) {
        this.c_allowed_prod_type = c_allowed_prod_type;
    }
}
