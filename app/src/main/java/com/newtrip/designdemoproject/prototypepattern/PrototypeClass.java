package com.newtrip.designdemoproject.prototypepattern;

import androidx.annotation.NonNull;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class PrototypeClass implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        PrototypeClass prototypeClass = null ;
        prototypeClass = (PrototypeClass) super.clone();
        return prototypeClass;
    }
}
