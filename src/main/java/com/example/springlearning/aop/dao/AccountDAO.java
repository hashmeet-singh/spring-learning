package com.example.springlearning.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount(){
        System.out.println("Adding Account to DB");
    }
}
