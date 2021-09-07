package com.newtrip.designdemoproject.interfacesegretionprinciple;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
public abstract class AbstractSearcher {
    IGoodBodyGirl iGoodBodyGirl ;
    IGreatTemperamentGirl iGreatTemperamentGirl ;
    public  AbstractSearcher(IGoodBodyGirl iGoodBodyGirl) {
        this.iGoodBodyGirl = iGoodBodyGirl ;
    }

    public AbstractSearcher(IGreatTemperamentGirl iGreatTemperamentGirl) {
        this.iGreatTemperamentGirl = iGreatTemperamentGirl ;
    }

    public abstract void show();

}
