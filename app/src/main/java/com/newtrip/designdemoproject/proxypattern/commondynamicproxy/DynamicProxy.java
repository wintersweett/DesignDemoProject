package com.newtrip.designdemoproject.proxypattern.commondynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author : WinterSweett
 * @time : {DATE}
 * 对于日志、事务、权限等都可以在系统设计阶段不用考虑，而在设计后通过AOP的方式切过去
 */
class DynamicProxy<T> {
    public static <T>T newProxyInstance(ClassLoader loader , Class<?>[] interfaces , InvocationHandler h){
      //寻找JoinPoint连接点，AOP框架使用元数据定义
        if(true){
          //执行一个前置通知
          (new BeforeAdvice()).exec();
      }
      //执行目标，并返回结果
        return (T) Proxy.newProxyInstance(loader,interfaces,h);
    }
}
