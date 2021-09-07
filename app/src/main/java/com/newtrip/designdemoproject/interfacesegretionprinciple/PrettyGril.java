package com.newtrip.designdemoproject.interfacesegretionprinciple;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
public class PrettyGril implements IGreatTemperamentGirl,IGoodBodyGirl{

    @Override
    public void goodLooking() {
        System.out.println("goodLooking");
    }

    @Override
    public void niceFigure() {
        System.out.println("niceFigure");
    }

    @Override
    public void greatTemperament() {
        System.out.println("greatTemperament");
    }
}
