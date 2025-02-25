package com.questionpro.hp.refactoring;

/**
 * Created by harpalsingh on 25/02/25.
 */
public enum CustomerType {
    REGULAR(0.05),
    PREMIUM(0.1),
    VIP(0.2);

    private final double discount;

    CustomerType(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
