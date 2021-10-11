package com.newtrip.designdemoproject.strategypattern.strategyenum;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Client {
    public static void main(String[] args) {
        int a = 1;
        String symbol = "+";
        int b = 2;
        System.out.println(EnumCaculator.ADD.exec(a,b));
    }
}
