package com.questionpro.hp.refactoring;

@FunctionalInterface
public interface DiscountStrategy {
    double getDiscountRate();
}