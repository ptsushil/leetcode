package com.biglots.com.leetcode.service;

import com.biglots.com.leetcode.pojos.Car;
import com.biglots.com.leetcode.pojos.Vehicle;

public class Abstraction {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start(); // Calls Car's implementation
        myCar.stop();  // Calls inherited concrete method
    }
}
