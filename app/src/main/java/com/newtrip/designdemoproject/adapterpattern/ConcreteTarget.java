package com.newtrip.designdemoproject.adapterpattern;

public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.printf("ConcreteTarget::");
    }
}
