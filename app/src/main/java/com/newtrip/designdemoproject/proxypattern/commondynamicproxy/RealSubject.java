package com.newtrip.designdemoproject.proxypattern.commondynamicproxy;

/**
 * @author : WinterSweett
 * @time : {DATE}
 * 真实主题
 */
class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("doSomething--->"+str);
    }
}
