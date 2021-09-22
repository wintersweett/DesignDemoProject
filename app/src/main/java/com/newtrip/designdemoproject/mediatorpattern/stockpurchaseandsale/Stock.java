package com.newtrip.designdemoproject.mediatorpattern.stockpurchaseandsale;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Stock extends AbstractColleague{
    public Stock(AbstractMediator mediator) {
        super(mediator);
    }
    private static int COMPUTER_NUM = 100 ;
    public void increase(int num){
        COMPUTER_NUM += num ;
        System.out.println("库存数量为："+COMPUTER_NUM);
    }
    public void decrease(int num){
        COMPUTER_NUM -= num ;
        System.out.println("库存数量为："+COMPUTER_NUM);
    }
    public int getStockNum(){
        return COMPUTER_NUM ;
    }
    public void clearStock(){
        System.out.println("清理存货数量为："+COMPUTER_NUM);
        super.mediator.excute("stock.clear");
    }
}
