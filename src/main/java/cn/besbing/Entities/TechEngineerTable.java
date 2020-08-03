package cn.besbing.Entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*@Getter
@Setter
@ToString*/
public class TechEngineerTable {

    private String taskId;
    private String taskReportedName;
    private String assginTo;
    private String cCoaLanguage;
    private String rptAssginTo;
    private String changedOn;
    private String rptRejectCommentS;
    private Long seqNum;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskReportedName() {
        return taskReportedName;
    }

    public void setTaskReportedName(String taskReportedName) {
        this.taskReportedName = taskReportedName;
    }

    public String getAssginTo() {
        return assginTo;
    }

    public void setAssginTo(String assginTo) {
        this.assginTo = assginTo;
    }

    public String getcCoaLanguage() {
        return cCoaLanguage;
    }

    public void setcCoaLanguage(String cCoaLanguage) {
        this.cCoaLanguage = cCoaLanguage;
    }

    public String getRptAssginTo() {
        return rptAssginTo;
    }

    public void setRptAssginTo(String rptAssginTo) {
        this.rptAssginTo = rptAssginTo;
    }

    public String getChangedOn() {
        return changedOn;
    }

    public void setChangedOn(String changedOn) {
        this.changedOn = changedOn;
    }

    public String getRptRejectCommentS() {
        return rptRejectCommentS;
    }

    public void setRptRejectCommentS(String rptRejectCommentS) {
        this.rptRejectCommentS = rptRejectCommentS;
    }

    public Long getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(Long seqNum) {
        this.seqNum = seqNum;
    }
}
