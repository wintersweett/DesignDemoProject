package com.newtrip.designdemoproject.strategypattern.common;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Client {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy();
        Context context = new Context(strategy);
        context.doAnything();
    }
}
