package com.gokulnathp.arrays;

public class Varargs {
    public void log(int ... numbers) { // spread operator in javascript
        for(int value: numbers) {
            System.out.print(value + " ");
        }
    }
}
