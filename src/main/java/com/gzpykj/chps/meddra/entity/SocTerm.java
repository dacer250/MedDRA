package com.gzpykj.chps.meddra.entity;

import com.gzpykj.chps.meddra.annotation.TokenIndex;

public class SocTerm {

    @TokenIndex(index=0)
    private Long socCode;

    @TokenIndex(index=1)
    private String socName;

    @TokenIndex(index=2)
    private String socAbbrev;

    @TokenIndex(index=3)
    private String socWhoartCode;

    @TokenIndex(index=3)
    private Long socHartsCode;

    @TokenIndex(index=5)
    private String socCostartSym;

    @TokenIndex(index=6)
    private String socIcd9Code;

    @TokenIndex(index=7)
    private String socIcd9cmCode;

    @TokenIndex(index=8)
    private String socIcd10Code;

    @TokenIndex(index=9)
    private String socJartCode;

    public Long getSocCode() {
        return socCode;
    }

    public void setSocCode(Long socCode) {
        this.socCode = socCode;
    }

    public String getSocName() {
        return socName;
    }

    public void setSocName(String socName) {
        this.socName = socName;
    }

    public String getSocAbbrev() {
        return socAbbrev;
    }

    public void setSocAbbrev(String socAbbrev) {
        this.socAbbrev = socAbbrev;
    }

    public String getSocWhoartCode() {
        return socWhoartCode;
    }

    public void setSocWhoartCode(String socWhoartCode) {
        this.socWhoartCode = socWhoartCode;
    }

    public Long getSocHartsCode() {
        return socHartsCode;
    }

    public void setSocHartsCode(Long socHartsCode) {
        this.socHartsCode = socHartsCode;
    }

    public String getSocCostartSym() {
        return socCostartSym;
    }

    public void setSocCostartSym(String socCostartSym) {
        this.socCostartSym = socCostartSym;
    }

    public String getSocIcd9Code() {
        return socIcd9Code;
    }

    public void setSocIcd9Code(String socIcd9Code) {
        this.socIcd9Code = socIcd9Code;
    }

    public String getSocIcd9cmCode() {
        return socIcd9cmCode;
    }

    public void setSocIcd9cmCode(String socIcd9cmCode) {
        this.socIcd9cmCode = socIcd9cmCode;
    }

    public String getSocIcd10Code() {
        return socIcd10Code;
    }

    public void setSocIcd10Code(String socIcd10Code) {
        this.socIcd10Code = socIcd10Code;
    }

    public String getSocJartCode() {
        return socJartCode;
    }

    public void setSocJartCode(String socJartCode) {
        this.socJartCode = socJartCode;
    }
}