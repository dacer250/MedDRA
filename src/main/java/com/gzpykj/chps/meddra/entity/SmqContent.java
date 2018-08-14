package com.gzpykj.chps.meddra.entity;

public class SmqContent {
    private Long smqCode;

    private Long termCode;

    private Integer termLevel;

    private Integer termScope;

    private String termCategory;

    private Integer termWeight;

    private String termStatus;

    private String termAdditionVersion;

    private String termLastModifiedVersion;

    public Long getSmqCode() {
        return smqCode;
    }

    public void setSmqCode(Long smqCode) {
        this.smqCode = smqCode;
    }

    public Long getTermCode() {
        return termCode;
    }

    public void setTermCode(Long termCode) {
        this.termCode = termCode;
    }

    public Integer getTermLevel() {
        return termLevel;
    }

    public void setTermLevel(Integer termLevel) {
        this.termLevel = termLevel;
    }

    public Integer getTermScope() {
        return termScope;
    }

    public void setTermScope(Integer termScope) {
        this.termScope = termScope;
    }

    public String getTermCategory() {
        return termCategory;
    }

    public void setTermCategory(String termCategory) {
        this.termCategory = termCategory;
    }

    public Integer getTermWeight() {
        return termWeight;
    }

    public void setTermWeight(Integer termWeight) {
        this.termWeight = termWeight;
    }

    public String getTermStatus() {
        return termStatus;
    }

    public void setTermStatus(String termStatus) {
        this.termStatus = termStatus;
    }

    public String getTermAdditionVersion() {
        return termAdditionVersion;
    }

    public void setTermAdditionVersion(String termAdditionVersion) {
        this.termAdditionVersion = termAdditionVersion;
    }

    public String getTermLastModifiedVersion() {
        return termLastModifiedVersion;
    }

    public void setTermLastModifiedVersion(String termLastModifiedVersion) {
        this.termLastModifiedVersion = termLastModifiedVersion;
    }
}