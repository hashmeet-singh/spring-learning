package com.example.springlearning.aop.afterReturningAdvice.aspect;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class PointcutExpression {
    @Pointcut("execution(* com.example.springlearning.aop.afterReturningAdvice.dao.*.*(..))")
    public void forDaoPackage() {
    }

    //Match all getters
    @Pointcut("execution(* com.example.springlearning.aop.afterReturningAdvice.dao.*.get*())")
    public void forGetters() {
    }

    //Match all setters
    @Pointcut("execution(* com.example.springlearning.aop.afterReturningAdvice.dao.*.set*(..))")
    public void forSetters() {
    }

    //create pointcut - Match package and exclude getters and setters
    @Pointcut("forDaoPackage() && !(forGetters() || forSetters())")
    public void forDAOPackageNoGettersSetters() {
    }
}
