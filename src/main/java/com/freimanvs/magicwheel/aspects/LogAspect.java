package com.freimanvs.magicwheel.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Aspect
@Component("logAspect")
@Qualifier("logAspect")
@Scope("singleton")
public class LogAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogAspect.class);

    @Around("execution(* com.freimanvs.magicwheel.rest.HelloController.print(..))")
    public Object index(ProceedingJoinPoint proceedingJoinPoint){
        LOGGER.info("Aspect before...");

        Object value = null;
        try {
            value = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        LOGGER.info("Aspect after...");
        return value;
    }
}