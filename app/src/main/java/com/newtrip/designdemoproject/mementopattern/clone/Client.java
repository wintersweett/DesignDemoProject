package com.newtrip.designdemoproject.mementopattern.clone;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("初始状态：");
        try {
            originator.createMento();
        } catch (Exception e) {
            e.printStackTrace();
        }
        originator.setState("修改后的");
        originator.restoreMemento();
    }
}
