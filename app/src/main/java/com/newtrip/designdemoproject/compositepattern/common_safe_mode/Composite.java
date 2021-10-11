package com.newtrip.designdemoproject.compositepattern.common_safe_mode;

import java.util.ArrayList;
import java.util.List;

/***
*@Author: WinterSweett
*@Date:
*@Description:树枝构件
*/
public class Composite extends Component{
    List<Component> list = new ArrayList<>();
    public void add(Component component){
        list.add(component);
    }
    public void remove(Component component){
        list.remove(component);
    }
    public List<Component> getChildren(){
        return list ;
    }
}
