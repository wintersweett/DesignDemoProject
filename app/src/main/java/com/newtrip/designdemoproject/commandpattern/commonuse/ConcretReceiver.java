package com.newtrip.designdemoproject.commandpattern.commonuse;

public class ConcretReceiver extends Receiver{
    @Override
    public void doSomething() {
        System.out.printf("do it");
    }
}
