package com.newtrip.designdemoproject.proxypattern.normal;

/**
 * @author : WinterSweett
 * @time : {DATE}
 * 普通代理,实现IProxy接口后，就拥有了自己的个性
 */
class GamePlayerProxy implements IGamePlayer,IProxy{
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
count();
    }

    @Override
    public void count() {
        System.out.println("54$");
    }
}
