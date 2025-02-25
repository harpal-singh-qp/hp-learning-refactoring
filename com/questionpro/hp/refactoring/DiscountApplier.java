package com.questionpro.hp.refactoring;

@FunctionalInterface
public interface DiscountApplier {
    double applyDiscount(double totalPrice, double discount);
}