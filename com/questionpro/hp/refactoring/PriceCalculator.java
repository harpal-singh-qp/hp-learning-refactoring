package com.questionpro.hp.refactoring;

import java.util.List;

/**
 * Created by harpalsingh on 25/02/25.
 */
public class PriceCalculator {
    public double calculateTotal(List<OrderItem> items) {
        double total = 0;
        for (OrderItem item : items) {
            total += item.price();
        }
        return total;
    }

    public double applyDiscount(double totalPrice, double discount) {
        return totalPrice - (totalPrice * discount);
    }
}
