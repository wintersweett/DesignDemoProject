package com.newtrip.designdemoproject.decoratepattern.common;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator(component);
        component.operate();
    }
}
