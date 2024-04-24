package com.gokulnathp.innerclass;

class Phone {
    public void show() {
        System.out.println("Before overriding");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        Phone phone = new Phone() {
            public void show() {
                System.out.println("After overriding");
            }
        };
        phone.show();
    }
}
