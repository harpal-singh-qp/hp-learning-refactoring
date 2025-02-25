package com.questionpro.hp.refactoring;

import java.util.List;

/**
 * Created by harpalsingh on 25/02/25.
 */
@FunctionalInterface
public interface TotalCalculator {
    double calculateTotal(List<OrderItem> items);
}