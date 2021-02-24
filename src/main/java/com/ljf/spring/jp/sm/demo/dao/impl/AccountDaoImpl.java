package com.ljf.spring.jp.sm.demo.dao.impl;

import com.ljf.spring.jp.sm.demo.bean.Account;
import com.ljf.spring.jp.sm.demo.dao.AccountDao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * @ClassName: AccountDaoImpl
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/02/22 18:02:28 
 * @Version: V1.0
 **/
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public List<Account> findAll() {
        List<Account> accounts = super.getJdbcTemplate().query("select id,account_name accountName,money from tb_account",new BeanPropertyRowMapper<Account>(Account.class));
         return  accounts;
    }

    @Override
    public void saveAccount(Account account) {
        super.getJdbcTemplate().update("insert into tb_account(id,account_name,money) values(?,?,?)",null,account.getAccountName(),account.getMoney());
    }
}
