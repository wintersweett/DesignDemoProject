package com.newtrip.designdemoproject.observerpattern.hanfeizilisi;

import java.util.Observable;
import java.util.Observer;

public class LiSi implements Observer {
    @Override
    public void update(Observable observable, Object o) {
        System.out.printf(observable+"  "+o);
    }
}
