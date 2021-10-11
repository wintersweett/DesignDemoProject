package com.newtrip.designdemoproject.chainofresponsibilitypattern.womenrequestuse;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Son extends Handler{
    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {

    }
}
