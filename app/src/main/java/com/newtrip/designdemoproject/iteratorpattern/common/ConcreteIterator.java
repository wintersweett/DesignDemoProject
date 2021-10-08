package com.newtrip.designdemoproject.iteratorpattern.common;

import java.util.Vector;

public class ConcreteIterator implements Iterator{
    Vector vector = new Vector();
    public int cursor = 0 ;
    public ConcreteIterator(Vector vector){
        this.vector = vector ;
    }
    @Override
    public Object next() {
        Object result = null ;
        if(this.hasNext()){
            result = vector.get(cursor++);
        }else {
            result = null ;
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        if(this.cursor == vector.size()){
            return false;
        }else {
            return true ;
        }
    }

    @Override
    public boolean remove() {
        vector.remove(this.cursor);
        return true;
    }
}
