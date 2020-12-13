package com.example.springlearning.aop.beforeAdvice.dao;

import com.example.springlearning.aop.beforeAdvice.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount(){
        System.out.println("Adding Account to DB");
    }

    public void addAccount(Account account){
        System.out.println("Adding Account to DB with param");
    }

    public void addSomeStuff(){
        System.out.println("Adding Some Stuff to DB");
    }
    public void goToSleep(){
        System.out.println("Going to sleep");
    }
}
