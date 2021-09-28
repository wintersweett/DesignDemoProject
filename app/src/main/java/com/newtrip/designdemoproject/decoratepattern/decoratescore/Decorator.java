package com.newtrip.designdemoproject.decoratepattern.decoratescore;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
abstract class Decorator extends SchoolReport {
    private SchoolReport sr ;
    public Decorator(SchoolReport schoolReport){
        this.sr = schoolReport ;
    }
    @Override
    public void report(){
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
