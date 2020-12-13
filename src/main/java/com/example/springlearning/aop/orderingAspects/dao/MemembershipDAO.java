package com.example.springlearning.aop.orderingAspects.dao;

import org.springframework.stereotype.Component;

@Component
public class MemembershipDAO {

    public void addAccount() {
        System.out.println("Adding Membership Account");
    }
}
