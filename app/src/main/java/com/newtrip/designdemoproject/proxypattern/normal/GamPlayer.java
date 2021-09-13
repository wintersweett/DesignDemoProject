package com.newtrip.designdemoproject.proxypattern.normal;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class GamPlayer implements IGamePlayer {
    private String name = "";
    public GamPlayer(IGamePlayer iGamePlayer,String name){
        if(iGamePlayer == null){
            try {
                throw new Exception("不能创建真实角色");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            this.name = name ;
        }

    }
    @Override
    public void login(String user, String password) {
        System.out.println("用户名："+user+"   name:"+this.name);
    }

    @Override
    public void killBoss() {
        System.out.println(this.name+"kissboss");
    }

    @Override
    public void update() {
        System.out.println(this.name+"update");
    }
}
