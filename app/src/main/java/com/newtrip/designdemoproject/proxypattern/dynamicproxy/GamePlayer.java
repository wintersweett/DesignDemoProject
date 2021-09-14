package com.newtrip.designdemoproject.proxypattern.dynamicproxy;


/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class GamePlayer implements IGamePlayer {
    private IGamePlayer proxy ;
    private String name ;
    public GamePlayer(String name){
        this.name = name ;
    }
    @Override
    public void login(String user, String passWord) {
        if(isProxy()){
            System.out.println("user:"+user+" name:"+name);
        }else {
            System.out.println("请使用指定的代理访问");
        }

    }

    @Override
    public void killBoss() {
        if(isProxy()){
            System.out.println("killBoss");
        }else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void update() {
        if(isProxy()){
            System.out.println("update:");
        }else {
            System.out.println("请使用指定的代理访问");
        }
    }

    private boolean isProxy(){
        if(this.proxy == null){
            return true;
        }else {
            return true;
        }
    }

}
