package com.questionpro.hp.refactoring;

import java.util.List;

/**
 * Created by harpalsingh on 25/02/25.
 */
public class OrderManagementSystem {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", CustomerType.VIP);
        Order order = new Order(customer);
        order.addItem("Laptop", 1000);
        order.addItem("Mouse", 50);
        order.addItem("Keyboard", 80);
        order.printOrder();
        generateInvoice(order);
    }

    public static void generateInvoice(Order order) {
        System.out.println("Generating Invoice...");
        System.out.println("Customer: " + order.getCustomer().name());
        double total = order.getItems().stream()
                           .mapToDouble(OrderItem::price)
                           .sum();
        double discountedTotal = total - (total * order.getCustomer().getDiscount());
        System.out.println("Total: $" + total);
        System.out.println("Discounted Total: $" + discountedTotal);
        System.out.println("Items: " + order.getItems());
        System.out.println("Thank you for shopping with us!");
    }
}
