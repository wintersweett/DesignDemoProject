package com.newtrip.designdemoproject.proxypattern.normal;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class GamePlayerProxy implements IGamePlayer{
    IGamePlayer iGamePlayer ;
    public GamePlayerProxy(String name){
        iGamePlayer = new GamPlayer(this,name);
    }
    @Override
    public void login(String user, String password) {
        this.iGamePlayer.login(user,password);

    }

    @Override
    public void killBoss() {
        this.iGamePlayer.killBoss();
    }

    @Override
    public void update() {
this.iGamePlayer.update();
    }
}
