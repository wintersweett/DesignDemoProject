package com.newtrip.designdemoproject.templatemethodpadttern;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
abstract class HumerModel {
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    public void run(){
        this.start();
        this.stop();
        if(isAlarm()){
            this.alarm();
        }
        this.engineBoom();

    }
    protected  boolean isAlarm(){
        return false;
    }
}
