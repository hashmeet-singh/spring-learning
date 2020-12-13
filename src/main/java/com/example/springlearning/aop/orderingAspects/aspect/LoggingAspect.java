package com.example.springlearning.aop.orderingAspects.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    //This is where we add all our logging advice

    //Pointcut Declaration
    //Match any method of any class with any params in dao package
    @Pointcut("execution(* com.example.springlearning.aop.orderingAspects.dao.*.*(..))")
    private void forDaoPackage() {
    }

    //Match all getters
    @Pointcut("execution(* com.example.springlearning.aop.orderingAspects.dao.*.get*())")
    private void forGetters() {
    }

    //Match all setters
    @Pointcut("execution(* com.example.springlearning.aop.orderingAspects.dao.*.set*(..))")
    private void forSetters() {
    }

    //create pointcut - Match package and exclude getters and setters
    @Pointcut("forDaoPackage() && !(forGetters() || forSetters())")
    private void forDAOPackageNoGettersSetters() {
    }
    //@Before advice executes before the method defined in pointcut expression is called

    @Before("forDAOPackageNoGettersSetters()")
    public void beforAddAccountAdvice() {
        System.out.println("\n====> @Before advice for any methods in dao package");
    }

    @Before("forDaoPackage()")
    public void performApiAnalytics() {
        System.out.println("====> @Before advice for API Analytics");
    }

    @Before("forDaoPackage()")
    public void cloudLoggingAdvice() {
        System.out.println("====> @Before advice for cloud logging");
    }

}
