package com.newtrip.designdemoproject.observerpattern.hanfeizilisi;


import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class HanFeiZi extends Observable implements IHanFeiZi {
    List<Observer> list = new ArrayList<>();

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
        this.list.add(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        super.deleteObserver(o);
        this.list.remove(o);
    }

    @Override
    public void notifyObservers(Object arg) {
        super.notifyObservers(arg);
        for(Observer observer : list){
            observer.update(this,arg);
        }
    }

    @Override
    public void haveBreakfast() {
        super.setChanged();
        super.notifyObservers("have breakfast");
    }

    @Override
    public void haveFun() {
        super.setChanged();
        super.notifyObservers("have fun");
    }
}
