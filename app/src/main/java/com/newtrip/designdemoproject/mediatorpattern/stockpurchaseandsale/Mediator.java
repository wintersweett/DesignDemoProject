package com.newtrip.designdemoproject.mediatorpattern.stockpurchaseandsale;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Mediator extends AbstractMediator{
    @Override
    public void excute(String str, Object... objects) {
        if(str.equals("purchase.buy")){
            this.buyComputer((Integer) objects[0]);
        }else if(str.equals("sale.sell")){
            this.sellComputer((Integer) objects[0]);
        }else if(str.equals("sale.offsell")){
            this.offSell();
        }else if(str.equals("stock.clear")){
            this.clearStock();
        }
    }
    private void buyComputer(int num){
        int saleStatus = sale.getSaleStatus() ;
        if(saleStatus > 80){
            System.out.println("采购电脑："+num+"台");
            super.stock.increase(num);
        }else {
            int buyNum =num/2 ;
            System.out.println("采购电脑："+num+"台");
        }
    }

    private void sellComputer(int num){
        if(super.stock.getStockNum() < num){
            super.purchase.buyIBMComputer(num);
        }
        super.stock.decrease(num);
    }
    private void offSell(){
        System.out.println("折价销售电脑："+stock.getStockNum()+"台");
    }
    private void clearStock(){
        super.sale.offSale();
        super.purchase.refuseBuy();
    }
}
