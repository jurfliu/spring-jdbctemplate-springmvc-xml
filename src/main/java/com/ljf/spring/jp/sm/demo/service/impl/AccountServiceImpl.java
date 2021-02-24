package com.ljf.spring.jp.sm.demo.service.impl;

import com.ljf.spring.jp.sm.demo.bean.Account;
import com.ljf.spring.jp.sm.demo.dao.AccountDao;
import com.ljf.spring.jp.sm.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: AccountServiceImpl
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/02/19 23:25:38 
 * @Version: V1.0
 **/

public class AccountServiceImpl implements AccountService {
    //spring的ioc 通过setter方法注入，属性名为actDao和spring-beans.xml中的标签名的id对应
    private AccountDao actDao;
    public AccountDao getActDao() {
        return actDao;
    }

    public void setActDao(AccountDao actDao) {
        this.actDao = actDao;
    }
    @Override
    public List<Account> findAll()  {
        List<Account> accountList=new ArrayList<>();
        accountList =actDao.findAll();
        return accountList;
    }

    @Override
    public void saveAccount(Account account) {
        actDao.saveAccount(account);
    }
}
