package com.newtrip.designdemoproject.adapterpattern;

public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.doSomething();
    }
}
