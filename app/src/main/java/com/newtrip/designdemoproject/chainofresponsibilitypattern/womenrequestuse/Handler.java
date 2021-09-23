package com.newtrip.designdemoproject.chainofresponsibilitypattern.womenrequestuse;

public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1 ;
    public final static int HUSBAND_LEVEL_REQUEST = 2 ;
    public final static int SON_LEVEL_REQUEST = 3 ;
    private int level = 0 ;
    private Handler nextHandler ;
    public Handler(int level){
        this.level = level ;
    }
}
