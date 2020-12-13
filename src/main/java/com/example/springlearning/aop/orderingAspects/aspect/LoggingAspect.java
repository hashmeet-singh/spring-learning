package com.example.springlearning.aop.orderingAspects.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class LoggingAspect {

    //This is where we add all our logging advice

    //Pointcut Declaration
    //Match any method of any class with any params in dao package

    //@Before advice executes before the method defined in pointcut expression is called

    @Before("com.example.springlearning.aop.orderingAspects.aspect.PointcutExpression.forDAOPackageNoGettersSetters()")
    public void beforAddAccountAdvice() {
        System.out.println("====> @Before advice for any methods in dao package");
    }
}
