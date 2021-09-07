package com.newtrip.designdemoproject.interfacesegretionprinciple;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
public class Searcher extends AbstractSearcher{
    PrettyGril prettyGril ;
    public Searcher(PrettyGril prettyGril) {
        super((IGoodBodyGirl) prettyGril);
        this.prettyGril = prettyGril ;
    }

    @Override
    public void show() {
        prettyGril.goodLooking();
        prettyGril.niceFigure();
        prettyGril.greatTemperament();
    }
}
