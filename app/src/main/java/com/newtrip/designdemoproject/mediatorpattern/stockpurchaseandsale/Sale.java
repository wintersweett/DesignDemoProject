package com.newtrip.designdemoproject.mediatorpattern.stockpurchaseandsale;

import com.newtrip.designdemoproject.R;

import java.util.Random;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Sale extends AbstractColleague {
    public Sale(AbstractMediator mediator) {
        super(mediator);
    }
    public void sellIBMComputer(int num){
        super.mediator.excute("sale.sell",num);
        System.out.println("销售电脑："+num+"台");

    }
    public int getSaleStatus(){
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("电脑的销售情况："+saleStatus);
        return saleStatus;
    }

    public void offSale(){
        super.mediator.excute("sale.offsell");
    }
}
