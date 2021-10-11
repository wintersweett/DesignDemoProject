package com.newtrip.designdemoproject.compositepattern.common_safe_mode;

public class Client {
    public static void main(String[] args) {
        Composite root  = new Composite();
        Composite branch = new Composite();
        root.add(branch);
        Leaf leaf = new Leaf() ;
        branch.add(leaf);
        display(root);
    }
    public static void display(Composite root){
        for(Component component : root.getChildren()){
            if( component instanceof Leaf){
                component.doSomething();
            }else {
                display(root);
            }
        }
    }

}
