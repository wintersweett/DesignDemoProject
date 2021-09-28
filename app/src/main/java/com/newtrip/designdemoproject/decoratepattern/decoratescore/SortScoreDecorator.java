package com.newtrip.designdemoproject.decoratepattern.decoratescore;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class SortScoreDecorator extends Decorator {
    public SortScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }
    private void reportSort(){
        System.out.println("我排38名");
    }

    @Override
    public void report() {
        super.report();
        reportSort();
    }
}
