package com.example.springlearning.aop.afterReturningAdvice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.example.springlearning.aop.afterReturningAdvice")
public class Config {
}
