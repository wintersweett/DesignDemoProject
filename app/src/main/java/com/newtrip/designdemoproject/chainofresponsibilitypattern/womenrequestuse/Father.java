package com.newtrip.designdemoproject.chainofresponsibilitypattern.womenrequestuse;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Father extends Handler{
    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {

    }
}
