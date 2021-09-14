package com.newtrip.designdemoproject.proxypattern.force;

/**
 * @author : WinterSweett
 * @time : {DATE}
 * 强制代理
 */
class GamePlayerProxy implements IGamePlayer{
    private IGamePlayer iGamePlayer ;
    public GamePlayerProxy(IGamePlayer iGamePlayer){
        this.iGamePlayer = iGamePlayer ;
    }
    @Override
    public void login(String user, String passWord) {
        this.iGamePlayer.login(user,passWord);
    }

    @Override
    public void killBoss() {
        this.iGamePlayer.killBoss();
    }

    @Override
    public void update() {
this.iGamePlayer.update();
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
