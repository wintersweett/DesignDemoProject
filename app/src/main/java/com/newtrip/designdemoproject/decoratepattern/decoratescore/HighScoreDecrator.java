package com.newtrip.designdemoproject.decoratepattern.decoratescore;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class HighScoreDecrator extends Decorator {
    public HighScoreDecrator(SchoolReport schoolReport) {
        super(schoolReport);
    }
    private void reportHighScore(){
        System.out.println("我们这次 最高75");
    }

    @Override
    public void report() {
        reportHighScore();
        super.report();
    }
}
