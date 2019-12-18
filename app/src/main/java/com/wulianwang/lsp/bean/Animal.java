package com.wulianwang.lsp.bean;

/**
 * 谭敏，孙彦婷
 * 5.12.1 未接（fragment)
 * （不显示时间），点击任务，显示未接任务详情
 */
public class Animal {
    private String aName;
    private String aSpeak;

    public Animal() {
    }

    public Animal(String aName, String aSpeak) {
        this.aName = aName;
        this.aSpeak = aSpeak;
    }

    public String getaName() {
        return aName;
    }

    public String getaSpeak() {
        return aSpeak;
    }


    public void setaName(String aName) {
        this.aName = aName;
    }

    public void setaSpeak(String aSpeak) {
        this.aSpeak = aSpeak;
    }

}