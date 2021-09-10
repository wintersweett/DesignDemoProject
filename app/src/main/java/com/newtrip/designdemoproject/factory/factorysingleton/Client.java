package com.newtrip.designdemoproject.factory.factorysingleton;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Client {
    public static void main(String[] args) {
        Singleton singleton = SingeltonFactory2.getInstance(Singleton.class);
        System.out.println(singleton.hashCode());
    }
}
