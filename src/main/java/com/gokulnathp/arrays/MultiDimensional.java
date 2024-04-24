package com.gokulnathp.arrays;

public class MultiDimensional {
    int[][] arr1 = new int[5][5];
    int[][] arr2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    public void shift() {
        for(int[] arr: arr2) {
            for(int value: arr) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
