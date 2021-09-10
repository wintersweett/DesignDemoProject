package com.newtrip.designdemoproject.factory.factorysingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class SingeltonFactory2 {
   private static Map<Class,Object> sInstanceCache = new ConcurrentHashMap<>();
    public static <T>T getInstance(Class<T> clazz){
        Object cache = sInstanceCache.get(clazz);
        if(cache == null){
            synchronized (SingeltonFactory2.class){
                if(cache == null){
                    T o = null;
                    try {
                        Class<?> cl = Class.forName(clazz.getName());
                        Constructor constructor = cl.getConstructor();
                        constructor.setAccessible(true);
                        o = (T) constructor.newInstance();
                        sInstanceCache.put(clazz,o);
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    return o;
                }
            }

        }
        return (T) cache;
    }
}
