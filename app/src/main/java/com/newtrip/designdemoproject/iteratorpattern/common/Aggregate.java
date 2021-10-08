package com.newtrip.designdemoproject.iteratorpattern.common;
/***
*@Author: WinterSweett
*@Date:
*@Description:抽象容器
*/
public interface Aggregate {
    public void add(Object object);
    public void remove(Object object);
    public Iterator iterator();
}
