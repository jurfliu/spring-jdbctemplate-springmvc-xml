package com.ljf.spring.jp.sm.demo.dao;

import com.ljf.spring.jp.sm.demo.bean.Account;

import java.util.List;

public interface AccountDao {
    /**
     * 根据名称查询账户
     * @return
     */
    List<Account> findAll();

    /**
     * 更新账户
     * @param account
     */
    public void saveAccount(Account account);
}
