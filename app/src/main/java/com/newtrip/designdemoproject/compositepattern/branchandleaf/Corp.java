package com.newtrip.designdemoproject.compositepattern.branchandleaf;

public abstract class Corp {
    private String name = "";
    private String position = "";
    private int salary = 0 ;
    private Corp parent ;

    public Corp getParent() {
        return parent;
    }

    public void setParent(Corp parent) {
        this.parent = parent;
    }

    public Corp(String name , String position , int salary){
        this.name = name ;
        this.position = position ;
        this.salary = salary ;
    }
    public String getInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("name:").append(name)
                .append("position:").append(position)
                .append("salary:").append(salary);
        return stringBuilder.toString();
    }
}
