package com.example.springlearning.aop.joinPoint.aspect;

import com.example.springlearning.aop.joinPoint.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
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
    //Using joinpoint to get the metadata of the method it's being called before
    @Before("com.example.springlearning.aop.joinPoint.aspect.PointcutExpression.forDAOPackageNoGettersSetters()")
    public void beforAddAccountAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("====> @Before advice method signature - " + methodSignature);
        Object[] args = joinPoint.getArgs();

        for (Object arg : args) {
            System.out.println(arg.toString());

            if (arg instanceof Account) {
                Account account = (Account) arg;
                System.out.println("Account:" + account.getName() + " - " + account.getLevel());
            }
        }

    }
}
