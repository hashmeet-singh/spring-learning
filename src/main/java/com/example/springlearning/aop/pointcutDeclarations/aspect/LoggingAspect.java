package com.example.springlearning.aop.pointcutDeclarations.aspect;

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
    @Pointcut("execution(* com.example.springlearning.aop.pointcutDeclarations.dao.*.*(..))")
    private void forDaoPackage(){}

    //@Before advice executes before the method defined in pointcut expression is called

    @Before("forDaoPackage()")
    public void beforAddAccountAdvice(){
        System.out.println("====> @Before advice for any methods in dao package");
    }

}
