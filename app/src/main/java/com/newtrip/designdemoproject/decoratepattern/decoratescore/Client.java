package com.newtrip.designdemoproject.decoratepattern.decoratescore;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Client {
    public static void main(String[] args) {
        SchoolReport schoolReport ;
        schoolReport = new FouthGradeSchoolReport();
        schoolReport = new HighScoreDecrator(schoolReport) ;
        schoolReport = new SortScoreDecorator(schoolReport);
        schoolReport.report();
        schoolReport.sign("ss");
    }
}
