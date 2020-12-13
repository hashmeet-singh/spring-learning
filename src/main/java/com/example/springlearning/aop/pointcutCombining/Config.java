package com.example.springlearning.aop.pointcutCombining;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.example.springlearning.aop.pointcutCombining")
public class Config {
}
