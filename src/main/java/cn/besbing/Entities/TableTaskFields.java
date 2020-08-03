package cn.besbing.Entities;

public class TableTaskFields {
    private String taskId;
    private String project;
    private String taskReportedName;
    private String analysis;
    private Long testNumber;
    private Long planTestTime;
    private String lab;


    @Override
    public String toString() {
        return "TableTaskFields{" +
                "taskId='" + taskId + '\'' +
                ", project='" + project + '\'' +
                ", taskReportedName='" + taskReportedName + '\'' +
                ", analysis='" + analysis + '\'' +
                ", testNumber=" + testNumber +
                ", planTestTime=" + planTestTime +
                ", lab='" + lab + '\'' +
                '}';
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getTaskReportedName() {
        return taskReportedName;
    }

    public void setTaskReportedName(String taskReportedName) {
        this.taskReportedName = taskReportedName;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public Long getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(Long testNumber) {
        this.testNumber = testNumber;
    }

    public Long getPlanTestTime() {
        return planTestTime;
    }

    public void setPlanTestTime(Long planTestTime) {
        this.planTestTime = planTestTime;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }
}
