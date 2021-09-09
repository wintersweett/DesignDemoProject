package com.newtrip.designdemoproject.factory.simplefactorypattern;

import com.newtrip.designdemoproject.factory.IHuman;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class HumanFactory {
    public static <T extends IHuman>T createHuman(Class<T> tClass){
        IHuman human = null;
        try {
            human = (T) Class.forName(tClass.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
