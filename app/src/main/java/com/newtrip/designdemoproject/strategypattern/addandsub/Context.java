package com.newtrip.designdemoproject.strategypattern.addandsub;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Context {
    private Caculator caculator ;
    public Context(Caculator caculator){
        this.caculator = caculator ;
    }
    public int exec(int a,int b,String symbol){
        return this.caculator.exec(a,b);
    }
}
