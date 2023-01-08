package org.zero.boot3.common.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);
    /**
     * 切入点
     */
    @Pointcut("execution(* org.zero.boot3.service.*.*(..))")
    public void pc1(){

    }

    /**
     * 前置通知
     * @param point 连接点
     */
    @Before(value = "pc1()")
    public void before(JoinPoint point){
        String name = point.getSignature().getName();
        System.out.println(name + "方法开始执行...");
    }

    /**
     * 后置通知
     * @param point 连接点
     */
    @After(value = "pc1()")
    public void after(JoinPoint point){
        String name = point.getSignature().getName();
        System.out.println(name + "方法结束执行...");
    }

    /**
     * 返回通知
     * @param point 连接点
     * @param result 返回值
     */
    @AfterReturning(value = "pc1()", returning = "result")
    public void afterReturning(JoinPoint point, Object result){
        String name = point.getSignature().getName();
        System.out.println(name + "方法返回值为:" + result);
    }

    /**
     * 异常通知
     * @param point 连接点
     * @param e 异常
     */
    @AfterThrowing(value = "pc1()", throwing = "e")
    public void afterThrowing(JoinPoint point, Exception e){
        String name = point.getSignature().getName();
        System.out.println(name + "方法抛出异常,异常为:" + e.getMessage());
        logger.error("name Exception = ", e);
    }

    /**
     * 环绕通知
     * @param point 连接点
     * @return result
     * @throws Throwable 抛出异常
     */
    @Around(value = "pc1()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        String name = point.getSignature().getName();
        long start = System.currentTimeMillis();
        Object result = point.proceed();
        long end = System.currentTimeMillis();
        System.out.println(name + "方法执行时间为:" + (end - start) + "ms");
        return result;
    }
}
