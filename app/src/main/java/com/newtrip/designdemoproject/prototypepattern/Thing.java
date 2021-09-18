package com.newtrip.designdemoproject.prototypepattern;

import java.util.ArrayList;

import androidx.annotation.NonNull;

/**
 * @author : WinterSweett
 * @time : {DATE}
 * 拷贝是内存中二进制流的拷贝；基本数据类型和string 即使没有特殊操作 也会被拷贝
 */
class Thing  {
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Thing thing = null ;
        thing = (Thing) super.clone();
        //深拷贝
        thing.arrayList = (ArrayList<String>) thing.arrayList.clone();
        return thing;
    }
}
