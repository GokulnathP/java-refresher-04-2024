package com.gokulnathp.arrays;

import java.util.Random;

public class SingleDimensional {
    int[] arr = new int[5];
    int[] arr2 = { 1, 2, 3, 4, 5};

    public void set() {
        Random random = new Random();

        try {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Error occurred. " + e);
        }
    }

    public void get() {
        for(int value: arr) {
            System.out.println(value);
        }
    }
}
