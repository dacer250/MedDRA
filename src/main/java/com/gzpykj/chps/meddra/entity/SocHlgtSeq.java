package com.gzpykj.chps.meddra.entity;

public class SocHlgtSeq {
    private String sHVersionDate;

    private String sHActionCode;

    private String sHModFldNum;

    private Long socCode;

    private Long hlgtCode;

    public String getsHVersionDate() {
        return sHVersionDate;
    }

    public void setsHVersionDate(String sHVersionDate) {
        this.sHVersionDate = sHVersionDate;
    }

    public String getsHActionCode() {
        return sHActionCode;
    }

    public void setsHActionCode(String sHActionCode) {
        this.sHActionCode = sHActionCode;
    }

    public String getsHModFldNum() {
        return sHModFldNum;
    }

    public void setsHModFldNum(String sHModFldNum) {
        this.sHModFldNum = sHModFldNum;
    }

    public Long getSocCode() {
        return socCode;
    }

    public void setSocCode(Long socCode) {
        this.socCode = socCode;
    }

    public Long getHlgtCode() {
        return hlgtCode;
    }

    public void setHlgtCode(Long hlgtCode) {
        this.hlgtCode = hlgtCode;
    }
}