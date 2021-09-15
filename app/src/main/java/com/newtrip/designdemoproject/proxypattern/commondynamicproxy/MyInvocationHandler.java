package com.newtrip.designdemoproject.proxypattern.commondynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author : WinterSweett
 * @time : {DATE}
 * 动态代理的Handler类
 */
class MyInvocationHandler implements InvocationHandler {
    //被代理的对象
    private Object target = null ;
    //通用构造函数传递一个对象
    public MyInvocationHandler(Object obj){
        this.target = obj ;
    }
    //代理方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行被代理的方法,所有通过动态代理实现的方法，全部通过invoke调用
        return method.invoke(target,args);
    }
}
