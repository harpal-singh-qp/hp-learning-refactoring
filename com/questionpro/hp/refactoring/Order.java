package com.questionpro.hp.refactoring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by harpalsingh on 25/02/25.
 */
public class Order {
    private final Customer customer;
    private final List<OrderItem> items;
    private final TotalCalculator totalCalculator;
    private final DiscountApplier discountApplier;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.totalCalculator = new PriceCalculator();
        this.discountApplier = new PriceCalculator();
    }

    public void addItem(String item, double price) {
        items.add(new OrderItem(item, price));
    }

    public void printOrder() {
        double totalPrice = calculateTotal();
        double discountedPrice = discountApplier.applyDiscount(totalPrice, customer.getDiscount());

        System.out.println("Customer: " + customer.name());
        System.out.println("Items: " + items);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Discounted Price: " + discountedPrice);
    }

    public double calculateTotal() {
        return totalCalculator.calculateTotal(items);
    }

    public double totalDiscount() {
        return discountApplier.applyDiscount(calculateTotal(), customer.getDiscount());
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<OrderItem> getItems() {
        return Collections.unmodifiableList(items);
    }
}