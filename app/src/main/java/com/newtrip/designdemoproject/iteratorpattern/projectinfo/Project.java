package com.newtrip.designdemoproject.iteratorpattern.projectinfo;

import java.util.ArrayList;
import java.util.List;
/***
*@Author: WinterSweett
*@Date:
*@Description:项目信息
*/
public class Project implements IProject{
    private List<IProject> projectList = new ArrayList<>();
    private String name ;
    private int num = 0 ;
    private int cost = 0 ;
    public Project(){

    }
    private Project(String name , int num, int cost){
        this.name = name ;
        this.num = num ;
         this.cost = cost ;
    }

    @Override
    public void add(String name, int num, int cost) {
        projectList.add(new Project(name,num,cost));

    }

    @Override
    public String getProjectInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.name).append(" ").append(this.num).append(" ").append(this.cost);
        return stringBuilder.toString();
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(projectList);
    }
}
