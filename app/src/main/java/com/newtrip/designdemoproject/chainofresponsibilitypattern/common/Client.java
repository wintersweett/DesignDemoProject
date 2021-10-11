package com.newtrip.designdemoproject.chainofresponsibilitypattern.common;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Client {
    public static void main(String[] args) {
        Handler handler = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler.setNext(handler2);
        Response response = handler.handleMessage(new Request());
    }
}
