package com.newtrip.designdemoproject.mediatorpattern.stockpurchaseandsale;

/**
 * @author : WinterSweett
 * @time : {DATE}
 * 采购管理
 */
class Purchase extends AbstractColleague{
    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }
    public void buyIBMComputer(int num){
        super.mediator.excute("purchase.buy",num);
    }
    public void refuseBuy(){
        System.out.println("不再采购IBM");
    }
}
