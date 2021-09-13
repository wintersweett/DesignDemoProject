package com.newtrip.designdemoproject.builderpattern;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
class ConcreteProduct extends Builder {
    private Product product = new Product();
    @Override
    public void setPart() {

    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
