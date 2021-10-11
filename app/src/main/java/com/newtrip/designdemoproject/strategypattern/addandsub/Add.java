package com.newtrip.designdemoproject.strategypattern.addandsub;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Add implements Caculator {
    @Override
    public int exec(int a, int b) {
        return a+b;
    }
}
