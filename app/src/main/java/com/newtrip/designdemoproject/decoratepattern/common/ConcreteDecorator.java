package com.newtrip.designdemoproject.decoratepattern.common;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void method(){
        System.out.println("method decorate");
    }

    @Override
    public void operate() {
        this.method();
        super.operate();
    }
}
