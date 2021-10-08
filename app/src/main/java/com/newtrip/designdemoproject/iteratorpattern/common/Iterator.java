package com.newtrip.designdemoproject.iteratorpattern.common;
/***
*@Author: WinterSweett
*@Date:
*@Description: 抽象迭代器
*/
public interface Iterator {
    public Object next();
    public boolean hasNext();
    public boolean remove();
}
