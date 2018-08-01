package com.whcs.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Yegz on 2017/9/4.
 */
@Aspect
@Component
public class PersonServiceLogger {
    Logger logger = Logger.getLogger(PersonServiceLogger.class);

    @Pointcut("execution(* com.whcs.service..*.*(..))")
    public void myPointCut(){
    }

    @Before("myPointCut()")
    public void beforeMethod(JoinPoint jp){
        logger.warn("这是前置增强的方法");
    }

    /*后置增强*/
    @AfterReturning(value = "myPointCut()", returning = "result")
    public void afterReturningMethod(JoinPoint jp, Object result){
        logger.warn("这是后置增强的方法");
    }

    @After("execution(* com.whcs.service.impl.PersonService(..))")
    public void afterMethod(JoinPoint joinPoint){
        logger.warn("这是最终增强的方法");
    }

    @Around("myPointCut()")
    public void aroundMethod(JoinPoint joinPoint){
        logger.warn("这是环绕增强的方法");
    }

    @AfterThrowing("myPointCut()")
    public void afterThrowingMethod(){
        logger.warn("这是异常增强的方法");
    }
}
