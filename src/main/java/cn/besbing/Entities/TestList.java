package cn.besbing.Entities;

import java.util.Date;

public class TestList {
    private String name;

    private String description;

    private Date changedOn;

    private String changedBy;

    private String removed;

    private String groupName;

    private String extLink;

    private String globalFlag;

    private String owner;

    private String setRsltOrderNo;

    private String approvalRole;

    private String tAllowedProduct;

    private String tAllowedSamType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getChangedOn() {
        return changedOn;
    }

    public void setChangedOn(Date changedOn) {
        this.changedOn = changedOn;
    }

    public String getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(String changedBy) {
        this.changedBy = changedBy;
    }

    public String getRemoved() {
        return removed;
    }

    public void setRemoved(String removed) {
        this.removed = removed;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getExtLink() {
        return extLink;
    }

    public void setExtLink(String extLink) {
        this.extLink = extLink;
    }

    public String getGlobalFlag() {
        return globalFlag;
    }

    public void setGlobalFlag(String globalFlag) {
        this.globalFlag = globalFlag;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSetRsltOrderNo() {
        return setRsltOrderNo;
    }

    public void setSetRsltOrderNo(String setRsltOrderNo) {
        this.setRsltOrderNo = setRsltOrderNo;
    }

    public String getApprovalRole() {
        return approvalRole;
    }

    public void setApprovalRole(String approvalRole) {
        this.approvalRole = approvalRole;
    }

    public String gettAllowedProduct() {
        return tAllowedProduct;
    }

    public void settAllowedProduct(String tAllowedProduct) {
        this.tAllowedProduct = tAllowedProduct;
    }

    public String gettAllowedSamType() {
        return tAllowedSamType;
    }

    public void settAllowedSamType(String tAllowedSamType) {
        this.tAllowedSamType = tAllowedSamType;
    }
}