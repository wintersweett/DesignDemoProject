package com.newtrip.designdemoproject.proxypattern.commondynamicproxy;

import android.os.Bundle;

import java.lang.reflect.InvocationHandler;

/**
 * @author : WinterSweett
 * @time : {DATE}
 * 具体业务的动态代理
 */
class SubjectDynamicProxy extends DynamicProxy{
    public static<T>T  newProxyInstance(Subject subject) {
        ClassLoader loader = subject.getClass().getClassLoader();
        Class<?>[] classes = subject.getClass().getInterfaces();
        InvocationHandler handler = new MyInvocationHandler(subject);

        return newProxyInstance(loader,classes,handler);
    }
}
