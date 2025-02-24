package com.biglots.com.leetcode;

import com.biglots.com.leetcode.pojos.Coupon;
import com.biglots.com.leetcode.pojos.ShoppingCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {

    private ShoppingCart shoppingCart;
    @BeforeEach
    public void setUp(){
        shoppingCart = new ShoppingCart();
    }
    @Test
    public void testAddItem(){
        shoppingCart.addItem(10);
        shoppingCart.addItem(20);
        shoppingCart.addItem(30);
        shoppingCart.addItem(40);
        assertEquals (100, shoppingCart.calculateTotal());
    }

    @Test
    public void testApplyCoupon(){
        shoppingCart.addItem(10);
        shoppingCart.addItem(20);
        shoppingCart.addItem(30);
        shoppingCart.addItem(40);
        Coupon coupon = new Coupon("SAV10", 10);
        shoppingCart.applyCoupon(coupon);
        assertEquals (90, shoppingCart.calculateTotal());

    }
}
