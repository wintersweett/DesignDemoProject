package com.newtrip.designdemoproject.iteratorpattern.projectinfo;

public class Boss {
    public static void main(String[] args) {
        IProject project = new Project() ;
        project.add("android进阶",10,100);
        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()){
            IProject p = (IProject) projectIterator.next();
            System.out.printf(p.getProjectInfo());

        }
    }
}
