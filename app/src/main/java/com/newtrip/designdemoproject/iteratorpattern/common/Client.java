package com.newtrip.designdemoproject.iteratorpattern.common;

public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("abc");
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()){
            System.out.printf(""+iterator.next());
        }
    }
}
