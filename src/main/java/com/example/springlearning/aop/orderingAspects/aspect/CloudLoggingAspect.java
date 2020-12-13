package com.example.springlearning.aop.orderingAspects.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(5)
public class CloudLoggingAspect {

    @Before("com.example.springlearning.aop.orderingAspects.aspect.PointcutExpression.forDaoPackage()")
    public void cloudLoggingAdvice() {
        System.out.println("====> @Before advice for cloud logging");
    }
}
