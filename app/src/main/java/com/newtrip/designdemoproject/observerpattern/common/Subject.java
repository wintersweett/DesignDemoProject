package com.newtrip.designdemoproject.observerpattern.common;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

public abstract class Subject {
    private Vector<Observer> observers = new Vector<>();
    public void addObserver(Observer o){
        this.observers.add(o);
    }
    public void delObserver(Observer o){
        this.observers.remove(o);
    }
    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(new Observable(),"");
        }
    }
}
