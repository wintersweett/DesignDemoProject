package com.newtrip.designdemoproject.mediatorpattern.commonmediator;
/***
*@Author: WinterSweett
*@Date:
*@Description:
*/
public abstract class Colleague {
    protected Mediator mediator ;
    public Colleague(Mediator mediator){
        this.mediator = mediator ;
    }
}
