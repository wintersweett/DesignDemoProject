package com.newtrip.designdemoproject.proxypattern.commondynamicproxy;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了！！");
    }
}
