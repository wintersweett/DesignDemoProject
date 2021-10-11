package com.newtrip.designdemoproject.chainofresponsibilitypattern.womenrequestuse;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Women implements IWomen{
    private int type = 0 ;
    private String request = "";
    public Women(int type ,String request){
        this.type = type ;
        this.request = request ;
    }
    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
