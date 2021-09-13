package com.newtrip.designdemoproject.proxypattern.force;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
interface IGamePlayer {
    void login(String user , String passWord);
    void killBoss();
    void update();
    IGamePlayer getProxy();
}
