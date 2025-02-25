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
        this.totalCalculator = items -> items.stream()
                                             .mapToDouble(OrderItem::price)
                                             .sum();
        this.discountApplier = (totalPrice, discount) -> totalPrice - (totalPrice * discount);
    }

    public void addItem(String item, double price) {
        items.add(new OrderItem(item, price));
    }

    public void printOrder() {
        double totalPrice = getTotalPrice();
        double discountedPrice = discountApplier.applyDiscount(totalPrice, customer.getDiscountRate());
        System.out.println("Customer: " + customer.getName());
        System.out.println("Items: " + items);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Discounted Price: " + discountedPrice);
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getTotalPrice() {
        return totalCalculator.calculateTotal(items);
    }

    public double getTotalDiscount(){
        return discountApplier.applyDiscount(getTotalPrice(), customer.getDiscountRate());
    }

    public List<OrderItem> getItems() {
        return Collections.unmodifiableList(items);
    }
}