package com.newtrip.designdemoproject.proxypattern.commondynamicproxy;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Client2 {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        proxy.doSomething("finish");
    }
}
