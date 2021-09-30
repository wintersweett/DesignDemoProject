package com.newtrip.designdemoproject.strategypattern.common;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Context {
    private Strategy strategy  = null ;
    public Context(Strategy strategy){
        this.strategy = strategy ;
    }
    public void doAnything(){
        this.strategy.doSomething();
    }
}
