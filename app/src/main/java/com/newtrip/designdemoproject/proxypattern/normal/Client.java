package com.newtrip.designdemoproject.proxypattern.normal;

/**
 * @author : WinterSweett
 * @time : {DATE}
 * 调用者只知道代理，而不用知道真实的角色是谁，屏蔽了真实角色的变更对高层模块的影响
 */
class Client {
    public static void main(String[] args) {
        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy("张三");
        gamePlayerProxy.login("zhangsan","123456");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.update();
    }
}
