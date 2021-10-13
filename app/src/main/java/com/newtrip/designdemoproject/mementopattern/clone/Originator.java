package com.newtrip.designdemoproject.mementopattern.clone;

import androidx.annotation.NonNull;

public class Originator {
    private Originator backup ;
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public void createMento() throws Exception {
        backup = (Originator) this.clone();
    }

    @NonNull
    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null ;
    }
    public void restoreMemento(){
        this.setState(this.backup.getState());
    }
}
