package com.newtrip.designdemoproject.observerpattern.common;

public class ConcreteSubject extends Subject{
    public void doSomething(){
        super.notifyObservers();
    }
}
