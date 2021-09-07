package com.newtrip.designdemoproject;

import com.newtrip.designdemoproject.interfacesegretionprinciple.AbstractSearcher;
import com.newtrip.designdemoproject.interfacesegretionprinciple.PrettyGril;
import com.newtrip.designdemoproject.interfacesegretionprinciple.Searcher;

import org.junit.Test;

/**
 * @author : WinterSweett
 */
public class TestOne {
    @Test
    public void test(){
        PrettyGril prettyGril = new PrettyGril();
        AbstractSearcher searcher = new Searcher(prettyGril);
        searcher.show();
    }
}
