package com.newtrip.designdemoproject.observerpattern.hanfeizilisi;

import java.util.Observer;

public class Client {
    public static void main(String[] args) {
        Observer lisi = new LiSi();
        HanFeiZi feiZi = new HanFeiZi();
        feiZi.addObserver(lisi);
    }
}
