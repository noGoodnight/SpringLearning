package com.mjh.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.mjh.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("before3!");
    }

    @After("execution(* com.mjh.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("after3!");
    }

    @Around("execution(* com.mjh.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("before around!");
        System.out.println(jp.getSignature());
        Object o = jp.proceed();
        System.out.println("after around!");
    }
}
