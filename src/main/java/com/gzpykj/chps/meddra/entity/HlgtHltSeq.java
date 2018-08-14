package com.gzpykj.chps.meddra.entity;

public class HlgtHltSeq {
    private String hHVersionDate;

    private String hHActionCode;

    private String hHModFldNum;

    private Long hlgtCode;

    private Long hltCode;

    public String gethHVersionDate() {
        return hHVersionDate;
    }

    public void sethHVersionDate(String hHVersionDate) {
        this.hHVersionDate = hHVersionDate;
    }

    public String gethHActionCode() {
        return hHActionCode;
    }

    public void sethHActionCode(String hHActionCode) {
        this.hHActionCode = hHActionCode;
    }

    public String gethHModFldNum() {
        return hHModFldNum;
    }

    public void sethHModFldNum(String hHModFldNum) {
        this.hHModFldNum = hHModFldNum;
    }

    public Long getHlgtCode() {
        return hlgtCode;
    }

    public void setHlgtCode(Long hlgtCode) {
        this.hlgtCode = hlgtCode;
    }

    public Long getHltCode() {
        return hltCode;
    }

    public void setHltCode(Long hltCode) {
        this.hltCode = hltCode;
    }
}