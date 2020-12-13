package com.example.springlearning.aop.pointcutCombining.dao;

import com.example.springlearning.aop.pointcutCombining.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    private String name;
    private String serviceCode;

    public void addAccount() {
        System.out.println("Adding Account to DB");
    }

    public void addAccount(Account account) {
        System.out.println("Adding Account to DB with param");
    }

    public void addSomeStuff() {
        System.out.println("Adding Some Stuff to DB");
    }

    public void goToSleep() {
        System.out.println("Going to sleep");
    }

    public String getName() {
        System.out.println(getClass() + ": is getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + ": is setName()");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass() + ": is getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass() + ": is setServiceCode()");
        this.serviceCode = serviceCode;
    }
}
