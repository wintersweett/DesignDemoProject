package com.newtrip.designdemoproject.mediatorpattern.stockpurchaseandsale;

/**
 * @author : WinterSweett
 * @time : {DATE}
 * 抽象中介者
 */
abstract class AbstractMediator {
    protected Purchase purchase ;
    protected Sale sale ;
    protected Stock stock ;
    public AbstractMediator(){
        purchase = new Purchase(this);
        sale = new Sale(this) ;
        stock = new Stock(this);
    }
    public abstract void excute(String str , Object...objects);

}
