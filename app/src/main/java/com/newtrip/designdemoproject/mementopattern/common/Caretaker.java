package com.newtrip.designdemoproject.mementopattern.common;
/***
*@Author: WinterSweett
*@Date:
*@Description:备忘录管理员角色
*/
public class Caretaker {
    private Memento memento ;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
