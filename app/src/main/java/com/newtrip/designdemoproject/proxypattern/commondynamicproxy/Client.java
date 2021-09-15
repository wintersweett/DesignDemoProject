package com.newtrip.designdemoproject.proxypattern.commondynamicproxy;

import java.lang.reflect.InvocationHandler;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Client {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandler handler = new MyInvocationHandler(subject);
        //主题的代理
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(),handler);
        //代理的行为
        proxy.doSomething("finish");
    }
}
