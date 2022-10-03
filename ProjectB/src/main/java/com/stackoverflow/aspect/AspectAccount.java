package com.stackoverflow.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

@Aspect
public class AspectAccount {
    private static Logger log = LoggerFactory.getLogger(AspectAccount.class);

    public AspectAccount() {
        log.info("AspectAccount init");
    }

    @Before("execution(* com.stackoverflow.aspect.AccountInterface.withdraw(..))")
    public void logReceivedQueueMessage(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        log.info("Spring AOP aspect executed, args: {}", Arrays.toString(args));
    }
}
