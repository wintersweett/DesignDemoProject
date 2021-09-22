package com.newtrip.designdemoproject.mediatorpattern.stockpurchaseandsale;

/**
 * @author : WinterSweett
 * @time : {DATE}
 * 抽象同事类
 */
class AbstractColleague {
    protected AbstractMediator mediator ;
    public AbstractColleague(AbstractMediator mediator){
        this.mediator = mediator ;
    }
}
