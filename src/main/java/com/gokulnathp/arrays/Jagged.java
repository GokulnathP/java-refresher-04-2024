package com.gokulnathp.arrays;

public class Jagged {
    int[][] arr1 = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
    };
    int[][] arr2 = new int[3][];

    public void set() {
        arr2[0] = new int[3];
        arr2[1] = new int[2];
        arr2[2] = new int[4];
    }
}
