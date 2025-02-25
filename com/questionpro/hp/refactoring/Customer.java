package com.questionpro.hp.refactoring;

/**
 * Created by harpalsingh on 25/02/25.
 */
public record Customer(String name, CustomerType type) {

    public double getDiscount() {
        return type.getDiscount();
    }
}