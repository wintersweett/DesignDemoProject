package com.newtrip.designdemoproject.commandpattern.businessuse;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Command command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();
    }
}
