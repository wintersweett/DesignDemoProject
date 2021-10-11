package com.newtrip.designdemoproject.chainofresponsibilitypattern.womenrequestuse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Client {
    public static void main(String[] args) {
        Random random = new Random();
        List<IWomen> list = new ArrayList<>();
        for(int i= 0 ;i < 5 ;i++){
            list.add(new Women(random.nextInt(4),"我要逛街"));
        }
        Handler father = new Father();
        Handler son = new Son();
        Handler husband = new Husband();
        father.setNext(husband);
        husband.setNext(son);
        for(IWomen women : list){
            father.handleMsg(women);
        }
    }
}
