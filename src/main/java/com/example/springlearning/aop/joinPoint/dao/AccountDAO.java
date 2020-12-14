package com.example.springlearning.aop.joinPoint.dao;

import com.example.springlearning.aop.joinPoint.Account;
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
//        goToSleep();
    }
    public void goToSleep(){
        System.out.println("Going to sleep");
    }
}
