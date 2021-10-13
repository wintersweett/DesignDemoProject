package com.newtrip.designdemoproject.facadepattern.common;

public class Facade {
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();
    public void methodA(){
        a.doSomething();
    }
    public void methodB(){
        b.doSomething();
    }
    public void methodC(){
        c.doSomething();
    }
}
