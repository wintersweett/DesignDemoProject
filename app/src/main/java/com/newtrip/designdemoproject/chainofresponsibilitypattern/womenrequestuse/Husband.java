package com.newtrip.designdemoproject.chainofresponsibilitypattern.womenrequestuse;

import com.newtrip.designdemoproject.chainofresponsibilitypattern.womenrequestuse.Handler;
import com.newtrip.designdemoproject.chainofresponsibilitypattern.womenrequestuse.IWomen;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Husband extends Handler {
    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {

    }
}
