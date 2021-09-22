package com.newtrip.designdemoproject.mediatorpattern.stockpurchaseandsale;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Client {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(100);
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);
        Stock stock = new Stock(mediator) ;
        stock.clearStock();
    }
}
