package com.example.springlearning.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    //This is where we add all our logging advice

    //@Before advice executes before the method defined in pointcut expression is called
    //Match addAccount method in any class
    @Before("execution(public void addAccount())")
    public void beforeAddAccountAdvice() {
        System.out.println("====> @Before advice running before adding account");
    }

    //Match addAccount only from AccountDAO
    @Before("execution(public void com.example.springlearning.aop.dao.AccountDAO.addAccount())")
    public void beforAddAccountSpecifictoAccountDAO(){
        System.out.println("====> @Before only running befor adding aaccount for AccountDAO only");
    }

    //Match all methods starting with add
    @Before("execution(public void add*())")
    public void beforeAddAdvice() {
        System.out.println("====> @Before advice running before any method starting with add");
    }

    //Match all methods starting with add and have Account parameter
    @Before("execution(* add*(com.example.springlearning.aop.Account))")
    public void beforeParamAdvice(){
        System.out.println("====> @Before advice running only on methods starting with add and have Account as parameter");
    }
}
