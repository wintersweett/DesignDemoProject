package com.newtrip.designdemoproject.builderpattern;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class Director {
    private Builder builder = new ConcreteProduct();
    public Product setAProduct(){
        builder.setPart();
        return builder.buildProduct();
    }
}
