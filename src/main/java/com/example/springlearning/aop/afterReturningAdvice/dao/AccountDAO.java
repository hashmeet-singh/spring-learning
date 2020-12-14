package com.example.springlearning.aop.afterReturningAdvice.dao;

import com.example.springlearning.aop.afterReturningAdvice.Account;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class AccountDAO {

    public void addAccount() {
        System.out.println("Adding Account to DB");
    }

    public void addAccount(Account account) {
        System.out.println("Adding Account to DB with param");
    }

    public void addSomeStuff() {
        System.out.println("Adding Some Stuff to DB");
//        goToSleep();
    }

    public void goToSleep() {
        System.out.println("Going to sleep");
    }

    public List<Account> fetchAccounts() {
        System.out.println("===>>>Inside fetchAccounts()");
        List<Account> accounts = Arrays.asList(
                new Account("Peter", "Silver"),
                new Account("Aubrey", "Platinum"),
                new Account("Kate", "Gold")
        );
        return accounts;
    }
}
