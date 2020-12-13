package com.example.springlearning.aop.orderingAspects.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class ApiAnalyticsAspect {

    @Before("com.example.springlearning.aop.orderingAspects.aspect.PointcutExpression.forDAOPackageNoGettersSetters()")
    public void performApiAnalytics() {
        System.out.println("====> @Before advice for API Analytics");
    }
}
