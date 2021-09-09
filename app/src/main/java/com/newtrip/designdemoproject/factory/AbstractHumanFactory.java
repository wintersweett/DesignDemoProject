package com.newtrip.designdemoproject.factory;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends IHuman>T createHuman(Class<T> c);
}
