package com.questionpro.hp.refactoring;

/**
 * Created by harpalsingh on 25/02/25.
 */
public record OrderItem(String name, double price) {

    @Override
    public String toString() {
        return name + ": $" + price;
    }
}
