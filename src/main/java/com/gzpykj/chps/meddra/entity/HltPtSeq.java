package com.gzpykj.chps.meddra.entity;

public class HltPtSeq {
    private String hPVersionDate;

    private String hPActionCode;

    private String hPModFldNum;

    private Long hltCode;

    private Long ptCode;

    public String gethPVersionDate() {
        return hPVersionDate;
    }

    public void sethPVersionDate(String hPVersionDate) {
        this.hPVersionDate = hPVersionDate;
    }

    public String gethPActionCode() {
        return hPActionCode;
    }

    public void sethPActionCode(String hPActionCode) {
        this.hPActionCode = hPActionCode;
    }

    public String gethPModFldNum() {
        return hPModFldNum;
    }

    public void sethPModFldNum(String hPModFldNum) {
        this.hPModFldNum = hPModFldNum;
    }

    public Long getHltCode() {
        return hltCode;
    }

    public void setHltCode(Long hltCode) {
        this.hltCode = hltCode;
    }

    public Long getPtCode() {
        return ptCode;
    }

    public void setPtCode(Long ptCode) {
        this.ptCode = ptCode;
    }
}