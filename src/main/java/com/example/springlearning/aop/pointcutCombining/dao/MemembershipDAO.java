package com.example.springlearning.aop.pointcutCombining.dao;

import org.springframework.stereotype.Component;

@Component
public class MemembershipDAO {

    public void addAccount() {
        System.out.println("Adding Membership Account");
    }
}
