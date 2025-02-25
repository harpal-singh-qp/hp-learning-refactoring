package com.questionpro.hp.refactoring;

import java.util.List;

/**
 * Created by harpalsingh on 25/02/25.
 */
public class OrderManagementSystem {
    public static void main(String[] args) {
        DiscountStrategy vipDiscountStrategy = () -> 0.2;

        Customer customer = new Customer("John Doe", vipDiscountStrategy);
        Order order = new Order(customer);
        order.addItem("Laptop", 1000);
        order.addItem("Mouse", 50);
        order.addItem("Keyboard", 80);
        order.printOrder();
        generateInvoice(order);
    }

    public static void generateInvoice(Order order) {
        System.out.println("Generating Invoice...");
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Total: $" + order.getTotalPrice());
        System.out.println("Discounted Total: $" + order.getTotalDiscount());
        System.out.println("You have saved Total: $" + (order.getTotalPrice()- order.getTotalDiscount()));
        System.out.println("Items: " + order.getItems());
        System.out.println("Thank you for shopping with us!");
    }
}
