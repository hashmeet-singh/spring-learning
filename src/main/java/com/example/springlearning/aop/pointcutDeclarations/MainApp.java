package com.example.springlearning.aop.pointcutDeclarations;

import com.example.springlearning.aop.pointcutDeclarations.dao.AccountDAO;
import com.example.springlearning.aop.pointcutDeclarations.dao.MemembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        //Read spring config file
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Config.class);

        //Get bean from Spring Context
        AccountDAO accountDao = applicationContext.getBean("accountDAO", AccountDAO.class);
        MemembershipDAO memembershipDAO = applicationContext.getBean("memembershipDAO", MemembershipDAO.class);

        //Call Account business method
        accountDao.addAccount();

        //Call membership business method
        memembershipDAO.addAccount();

        accountDao.addSomeStuff();

        Account account = new Account();
        accountDao.addAccount(account);

        accountDao.goToSleep();
        //Close the context
        applicationContext.close();

    }
}
