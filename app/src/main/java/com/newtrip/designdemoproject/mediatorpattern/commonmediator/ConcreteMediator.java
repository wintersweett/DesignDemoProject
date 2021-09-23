package com.newtrip.designdemoproject.mediatorpattern.commonmediator;

public class ConcreteMediator extends Mediator{
    @Override
    public void doSomething1() {
        super.c1.selfMethod();
        super.c2.selfMethod2();
    }

    @Override
    public void doSomething2() {
        super.c1.selfMethod();
        super.c2.selfMethod2();
    }
}
