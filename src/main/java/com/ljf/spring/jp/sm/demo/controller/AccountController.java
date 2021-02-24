package com.ljf.spring.jp.sm.demo.controller;

import com.ljf.spring.jp.sm.demo.bean.Account;
import com.ljf.spring.jp.sm.demo.dao.AccountDao;
import com.ljf.spring.jp.sm.demo.service.AccountService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;//在webmvc3.0.2包下
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName: AccountController
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/02/20 14:33:00 
 * @Version: V1.0
 **/
//@Controller
//@RequestMapping("/account")
public class AccountController  extends MultiActionController {
    private static Logger log = Logger.getLogger(AccountController.class);
    private AccountService actService;
    public AccountService getActService() {
        return actService;
    }
    public void setActService(AccountService actService) {
        this.actService = actService;
    }

    // @RequestMapping("/findAll")
   public ModelAndView findAll(HttpServletRequest request,HttpServletResponse response){
       System.out.println("表现层：查询所有账户...");
       log.info("表现层：查询所有账户...");
        List<Account> list = actService.findAll();
       ModelAndView modelAndView=new ModelAndView();
       modelAndView.addObject("list",list);
       modelAndView.setViewName("account_list");
       return modelAndView;
   }

    /**
     * 保存
     * @return
     */
   // @RequestMapping("/save")
    public ModelAndView update(HttpServletRequest request,HttpServletResponse response){
        System.out.println("----update----");
        return new ModelAndView("/multi","method","update");
    }
    /**
     * 保存
     * @return
     */
    // @RequestMapping("/save")
    public void save(HttpServletRequest request,HttpServletResponse response,Account account) throws IOException {
        log.info("表现层：保存账户信息...");
        String id=request.getParameter("id");
        String name=request.getParameter("accountName");
        String money=request.getParameter("money");
        System.out.println("name:"+name+"  "+account.getAccountName());
        actService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account?action=findAll");
        return;
    }
}
