package com.newtrip.designdemoproject.commandpattern.commonuse;

public class ConcreteCommand extends Command{
    //声明默认接收者
    public ConcreteCommand(){
        super(new ConcretReceiver());
    }
    //设置新的接收者
    public ConcreteCommand(Receiver receiver){
        super(receiver);
    }
    @Override
    public void execute() {
        super.receiver.doSomething();
    }
}
