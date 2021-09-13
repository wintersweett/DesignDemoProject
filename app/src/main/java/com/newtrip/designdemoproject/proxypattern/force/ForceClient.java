package com.newtrip.designdemoproject.proxypattern.force;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class ForceClient {
    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("范冰冰");
        IGamePlayer proxyPlayer = gamePlayer.getProxy();
        proxyPlayer.login("fanbingbing","123");
        proxyPlayer.killBoss();
        proxyPlayer.update();
    }
}
