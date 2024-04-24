package com.gokulnathp.conditions;

public class If {
    public void oddOrEven(int number) {
        if(number % 2 == 0) {
            System.out.println("It is even number");
        } else {
            System.out.println("It is odd number");
        }
    }

    public void greatestOf3(int a, int b, int c) {
        if(a > b && a > c) {
            System.out.println("A is greater");
        } else if(b > c) {
            System.out.println("B is greater");
        } else {
            System.out.println("C is greater");
        }
    }

    public String ternary(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    public void printWithoutSemiColon() {
        if(System.out.printf("Hello World") == null) {}
    }
}
