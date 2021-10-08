package com.newtrip.designdemoproject.iteratorpattern.common;

import java.util.Vector;

/***
*@Author: WinterSweett
*@Date:
*@Description:具体容器
*/
public class ConcreteAggregate implements Aggregate{
    Vector vector = new Vector();
    @Override
    public void add(Object object) {
        vector.add(object);
    }

    @Override
    public void remove(Object object) {
        remove(object);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(vector);
    }
}
