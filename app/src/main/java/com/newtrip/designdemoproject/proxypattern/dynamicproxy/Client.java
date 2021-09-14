package com.newtrip.designdemoproject.proxypattern.dynamicproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author : WinterSweett
 *
 * 动态代理的使用
 */
class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("zhangsan");
        InvocationHandler handler = new GamePlayIH(player);
        ClassLoader classLoader = player.getClass().getClassLoader();
        System.out.println("classloader:"+classLoader);
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader,new Class[]{IGamePlayer.class},handler);
        proxy.login("zhans","123");
        proxy.killBoss();
        proxy.update();
    }
}
