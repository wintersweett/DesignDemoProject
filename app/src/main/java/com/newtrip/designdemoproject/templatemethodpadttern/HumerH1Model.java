package com.newtrip.designdemoproject.templatemethodpadttern;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class HumerH1Model extends HumerModel {
    @Override
    protected void start() {
        System.out.println("start");
    }

    @Override
    protected void stop() {
        System.out.println("stop");
    }

    @Override
    protected void alarm() {
        System.out.println("alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("engineBoom");
    }

    boolean mAlarm ;
    @Override
    protected boolean isAlarm() {
        return mAlarm;
    }

    public void setAlarm(boolean alarm){
        this.mAlarm = alarm ;
    }
}
