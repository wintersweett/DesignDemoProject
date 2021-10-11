package com.newtrip.designdemoproject.compositepattern.branchandleaf;

import java.util.List;

public class Client {
    public static void main(String[] args) {

    }

    public static String getTreeInfo(Branch root){
        List<Corp> subordinateList = root.getSubordinate();
        String info = "";
        for(Corp corp : subordinateList){
            if(corp instanceof Leaf){
                info = info +root.getInfo()+"\n";
            }else if(corp instanceof Branch){
                info = info+root.getInfo()+"\n"+getTreeInfo((Branch) corp);
            }
        }
        return info ;
    }
}
