package com.example.springlearning.aop.afterReturningAdvice;

import com.example.springlearning.aop.afterReturningAdvice.dao.AccountDAO;
import com.example.springlearning.aop.afterReturningAdvice.dao.MemembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        //Read spring config file
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Config.class);

        //Get bean from Spring Context
        AccountDAO accountDao = applicationContext.getBean("accountDAO", AccountDAO.class);
        MemembershipDAO memembershipDAO = applicationContext.getBean("memembershipDAO", MemembershipDAO.class);

        //Call Account business method
        List<Account> accounts = accountDao.fetchAccounts();

        System.out.println("--------------------------------");
        System.out.println(accounts);
        System.out.println("--------------------------------");
        //Close the context
        applicationContext.close();

    }
}
