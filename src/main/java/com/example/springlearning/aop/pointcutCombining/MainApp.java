package com.example.springlearning.aop.pointcutCombining;

import com.example.springlearning.aop.pointcutCombining.dao.AccountDAO;
import com.example.springlearning.aop.pointcutCombining.dao.MemembershipDAO;
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

        accountDao.setName("foobar");
        accountDao.setServiceCode("schneider");

        String name = accountDao.getName();
        String serviceCode = accountDao.getServiceCode();

        accountDao.goToSleep();
        //Close the context
        applicationContext.close();

    }
}
