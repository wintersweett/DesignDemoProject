package com.newtrip.designdemoproject.commandpattern.commonuse;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Command command = new ConcreteCommand();
        invoker.setCommand(command);
        invoker.action();
    }
}
