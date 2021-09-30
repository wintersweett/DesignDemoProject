package com.newtrip.designdemoproject.strategypattern.addandsub;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Sub implements Caculator {
    @Override
    public int exec(int a, int b) {
        return a-b;
    }
}
