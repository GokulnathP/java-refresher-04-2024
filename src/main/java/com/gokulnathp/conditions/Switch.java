package com.gokulnathp.conditions;

public class Switch {
    public void log(int number) {
        switch (number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            default:
                System.out.println("Else");
        }
    }
}
