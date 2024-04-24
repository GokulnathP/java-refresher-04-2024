package com.gokulnathp.enumeration;

enum Mobile {
    APPLE(100), SAMSUNG, ONE_PLUS(75);

    final int price;

    Mobile() {
        this.price = 50;
    }

    Mobile(int price) {
        this.price = price;
    }
}

public class Enumeration {
    public static void log(Mobile mobile) {
        switch (mobile) {
            case APPLE -> System.out.println(Mobile.APPLE.price);
            case SAMSUNG -> System.out.println(Mobile.SAMSUNG.price);
            case ONE_PLUS -> System.out.println(Mobile.ONE_PLUS.price);
        }
    }

    public static void main(String[] args) {
        log(Mobile.APPLE);
        log(Mobile.SAMSUNG);
        log(Mobile.ONE_PLUS);
    }
}
