package com.newtrip.designdemoproject.compositepattern.branchandleaf;

import java.util.ArrayList;
import java.util.List;

public class Branch extends Corp{
    List<Corp> list = new ArrayList<>();
    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }
    public void addSubordinate(Corp corp){
        corp.setParent(this);
        list.add(corp);
    }
    public List<Corp> getSubordinate(){
        return list ;
    }
}
