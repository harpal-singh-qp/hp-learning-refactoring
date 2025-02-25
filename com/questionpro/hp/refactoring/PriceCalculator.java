package com.questionpro.hp.refactoring;

import java.util.List;

/**
 * Created by harpalsingh on 25/02/25.
 */
public class PriceCalculator implements TotalCalculator, DiscountApplier {
    @Override
    public double calculateTotal(List<OrderItem> items) {
        return items.stream()
                    .mapToDouble(OrderItem::price)
                    .sum();
    }

    @Override
    public double applyDiscount(double totalPrice, double discount) {
        return totalPrice - (totalPrice * discount);
    }
}
