package com.newtrip.designdemoproject.builderpattern;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Client {
    public static void main(String[] args) {
        Director director = new Director();
       Product product = director.setAProduct();
       product.doSomthing();
    }
}
