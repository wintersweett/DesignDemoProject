package com.newtrip.designdemoproject.factory;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory factory = new HumanFactory();
        IHuman human = factory.createHuman(BlackHuman.class);
        human.getColor();
    }
}
