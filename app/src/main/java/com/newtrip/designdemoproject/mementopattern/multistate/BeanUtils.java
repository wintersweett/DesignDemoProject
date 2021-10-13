package com.newtrip.designdemoproject.mementopattern.multistate;

import java.util.HashMap;

public class BeanUtils {
    public static HashMap<String , Object> backupProp(BeanInfo bean){
        HashMap<String , Object> result = new HashMap<>();
        result.put(bean.name,bean.value);
        return result ;
    }
    public static void restoreProp(BeanInfo info , HashMap<String,Object> map){

    }

}
