package com.example.springlearning.aop.afterReturningAdvice.aspect;

import com.example.springlearning.aop.afterReturningAdvice.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(2)
public class LoggingAspect {

    //This is where we add all our logging advice

    //Pointcut Declaration
    //Match any method of any class with any params in dao package

    //    After Returning Advice
    @AfterReturning(
            pointcut = "execution(* com.example.springlearning.aop.afterReturningAdvice.dao.AccountDAO.fetchAccounts(..))",
            returning = "result"            //Return value of the method. The method parameter must contain a parameter of this name with return type of the method
    )
    public void afterReturningFetchAccountsAdvice(JoinPoint joinPoint, List<Account> result) {
        System.out.println("===>>> Running @AfterRetruning advice on: " + joinPoint.getSignature().toShortString());
        System.out.println("===>>> Method output: " + result);
        convertAccNameToUpperCase(result);      //This will convert all account names to uppercase and that is the result which will be passed as the return of the method

    }

    private void convertAccNameToUpperCase(List<Account> result) {
        result.forEach(account -> {
            account.setName(account.getName().toUpperCase());
        });
    }

    @Before("com.example.springlearning.aop.afterReturningAdvice.aspect.PointcutExpression.forDAOPackageNoGettersSetters()")
    public void beforeAddAccountAdvice() {
        System.out.println("====> @Before advice for any methods in dao package");
    }
}
