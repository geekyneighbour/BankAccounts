package com.example.demo;
import java.util.List;

public class Data {
    private List<Account> accountList;
    private String sessionDataRedisHashId;


    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public String sessionDataRedisHashId() {
        return sessionDataRedisHashId;
    }

    public void setSessionDataRedisHashId(String sessionDataRedisHashId) {
        this.sessionDataRedisHashId = sessionDataRedisHashId;
    }
}
