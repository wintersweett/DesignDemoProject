package com.newtrip.designdemoproject.compositepattern.common_transparent_mode;

import java.util.List;

public abstract class Component {
    public void doSomething(){

    }
    abstract void add(Component component);
    abstract void delete(Component component);
    abstract List<Component> getChildren();
}
