package com.biglots.com.leetcode.service;

import com.biglots.com.leetcode.pojos.Animal;
import com.biglots.com.leetcode.pojos.Cat;

public class Polymorphism {
    public static void main(String arg[])
    {
        Animal animal= new Cat();
        animal.makeSound();
    }
}
