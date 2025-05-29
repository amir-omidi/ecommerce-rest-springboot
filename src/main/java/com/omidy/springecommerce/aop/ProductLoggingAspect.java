package com.omidy.springecommerce.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProductLoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductLoggingAspect.class);

    @Pointcut("execution(public * com.omidy.springecommerce.service.ProductService.*(..))")
    public void productServiceMethods() {}

    @Before("productServiceMethods()")
    public void logMethodCall(JoinPoint jp) {
        LOGGER.info("Calling method: " + jp.getSignature().getName());
    }

    @AfterReturning(pointcut = "productServiceMethods()", returning = "result")
    public void logMethodSuccess(JoinPoint jp, Object result) {
        LOGGER.info("Method executed successfully: " + jp.getSignature().getName() + ", returned: " + result);
    }

    @AfterThrowing(pointcut = "productServiceMethods()", throwing = "ex")
    public void logMethodException(JoinPoint jp, Throwable ex) {
        LOGGER.error("Method " + jp.getSignature().getName() + " threw exception: " + ex.getMessage(), ex);
    }

    @After("productServiceMethods()")
    public void logMethodComplete(JoinPoint jp) {
        LOGGER.info("Method completed: " + jp.getSignature().getName());
    }
}
