package com.ljf.spring.jp.sm.demo.bean;

import java.io.Serializable;

/**
 * @ClassName: Account
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/02/19 23:21:27 
 * @Version: V1.0
 **/
public class Account implements Serializable {
    private Integer id;
    private String accountName;
    private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", money=" + money +
                '}';
    }
}
