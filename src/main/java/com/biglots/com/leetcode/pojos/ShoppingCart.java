package com.biglots.com.leetcode.pojos;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Double> itemPrices;
    private Coupon appliedCoupon;

    public ShoppingCart() {
        this.itemPrices = new ArrayList<>();
        this.appliedCoupon = null;
    }

    public void addItem(double price) {
        itemPrices.add(price);
    }

    public void applyCoupon(Coupon coupon) {
        this.appliedCoupon = coupon;
    }

    public double calculateTotal() {
        double total = itemPrices.stream().mapToDouble(Double::doubleValue).sum();
        if (appliedCoupon != null) {

            double discount = total * appliedCoupon.getDiscountPercentage()/100;
            total -= discount;
        }
        return total;
    }

    // Display cart details
    public void displayCart() {
        System.out.println("\nShopping Cart:");
        System.out.println("Items in Cart: " + itemPrices.size());
        System.out.println("Total Before Discount: $" + itemPrices.stream().mapToDouble(Double::doubleValue).sum());

        if (appliedCoupon != null) {
            System.out.println("Applied Coupon: " + appliedCoupon.getCode() + " (" + appliedCoupon.getDiscountPercentage() + "% off)");
        }

        System.out.println("Final Total: $" + calculateTotal());
    }


    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(50.00);
        cart.addItem(40.00);
        cart.displayCart();
        Coupon coupon = new Coupon("SAVE10", 20);
        cart.applyCoupon(coupon);
        cart.displayCart();
    }
}
