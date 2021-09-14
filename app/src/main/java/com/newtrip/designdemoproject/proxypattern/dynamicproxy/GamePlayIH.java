package com.newtrip.designdemoproject.proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author : WinterSweett
 * @time : {DATE}
 * 动态代理
 */
class GamePlayIH implements InvocationHandler {
    Class cls;//被代理者
    Object obj;//被代理的实例
    public GamePlayIH(Object obj){
        this.obj = obj ;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj,args);
        //调用了login方法 就打印日志
        if(method.getName().equalsIgnoreCase("login")){
            System.out.println("有人在登录我的账号");
        }
        return result;
    }
}
