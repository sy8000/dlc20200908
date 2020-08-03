package cn.besbing.Entities;

public class ResultDefKey {
    private Long sampleNumber;

    private Long testNumber;

    private String name;

    @Override
    public String toString() {
        return "ResultDefKey{" +
                "sampleNumber=" + sampleNumber +
                ", testNumber=" + testNumber +
                ", name='" + name + '\'' +
                '}';
    }

    public Long getSampleNumber() {
        return sampleNumber;
    }

    public void setSampleNumber(Long sampleNumber) {
        this.sampleNumber = sampleNumber;
    }

    public Long getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(Long testNumber) {
        this.testNumber = testNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
