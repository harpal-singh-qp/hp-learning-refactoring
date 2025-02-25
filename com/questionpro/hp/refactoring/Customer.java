package com.questionpro.hp.refactoring;

/**
 * Created by harpalsingh on 25/02/25.
 */
public class Customer {
    private final String name;
    private final DiscountStrategy discountStrategy;

    public Customer(String name, DiscountStrategy discountStrategy) {
        this.name = name;
        this.discountStrategy = discountStrategy;
    }

    public String getName() {
        return name;
    }

    public double getDiscountRate() {
        return discountStrategy.getDiscountRate();
    }

    public double getDiscount(double totalPrice) {
        return totalPrice - (totalPrice * getDiscountRate());
    }
}