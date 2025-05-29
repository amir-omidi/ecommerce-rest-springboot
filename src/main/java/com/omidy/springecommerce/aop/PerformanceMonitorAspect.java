package com.omidy.springecommerce.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceMonitorAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(PerformanceMonitorAspect.class);

   
    @Around("execution(* com.omidy.springecommerce.service.ProductService.*(..))")
    public Object monitorTime(ProceedingJoinPoint jp) throws Throwable {
        long start = System.currentTimeMillis();

        Object result = jp.proceed();

        long end = System.currentTimeMillis();

        LOGGER.info("Execution time of {} :: {} ms", jp.getSignature().getName(), (end - start));

        return result;
    }
}
