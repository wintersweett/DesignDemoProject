package com.newtrip.designdemoproject.mediatorpattern.commonmediator;

public class ConcreteColleague1 extends Colleague{
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }
    //自有方法
    public void selfMethod(){

    }
    //依赖方法
    public void depMethod(){
        super.mediator.doSomething1();
    }
}
