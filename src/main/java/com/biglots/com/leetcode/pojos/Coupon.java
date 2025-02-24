package com.biglots.com.leetcode.pojos;

public class Coupon {
    private String code;
    private double discountPercentage;

    public Coupon(String code, double discountPercentage) {
        this.code= code;
        this.discountPercentage = discountPercentage;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
