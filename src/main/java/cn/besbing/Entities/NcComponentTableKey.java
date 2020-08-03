package cn.besbing.Entities;

public class NcComponentTableKey {
    private String ncComponentName;

    private String analysis;

    private String name;

    private Long version;

    public String getNcComponentName() {
        return ncComponentName;
    }

    public void setNcComponentName(String ncComponentName) {
        this.ncComponentName = ncComponentName;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}