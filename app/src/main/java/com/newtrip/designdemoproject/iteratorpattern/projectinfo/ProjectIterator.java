package com.newtrip.designdemoproject.iteratorpattern.projectinfo;

import java.util.ArrayList;
import java.util.List;

/***
*@Author: WinterSweett
*@Date:
*@Description:迭代器的实现类
*/
public class ProjectIterator implements IProjectIterator{
    private List<IProject> projectList = new ArrayList<>();
    private int currentItem = 0 ;
    public ProjectIterator(List<IProject> projectList){
        this.projectList = projectList ;
    }
    @Override
    public boolean hasNext() {
        boolean b = true ;
        if(currentItem >= projectList.size() ){
            b = false ;
        }
        return b;
    }

    @Override
    public IProject next() {
        return this.projectList.get(currentItem++);
    }
}
