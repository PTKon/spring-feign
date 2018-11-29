package com.cn.ridge.springfeign.bean;

/**
 * Author: create by wang.gf
 * Date: create at 2018/11/28
 */
public class ClientBean {
    private String historyJobId;

    public ClientBean() {
    }

    public ClientBean(String historyJobId) {
        this.historyJobId = historyJobId;
    }

    public String getHistoryJobId() {
        return historyJobId;
    }

    public void setHistoryJobId(String historyJobId) {
        this.historyJobId = historyJobId;
    }
}
