package com.newtrip.designdemoproject.decoratepattern.decoratescore;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class FouthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("语文65");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为："+name);
    }
}
