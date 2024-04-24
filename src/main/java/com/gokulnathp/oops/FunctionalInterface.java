package com.gokulnathp.oops;

interface SingleMethod {
    public void show();
}


public class FunctionalInterface { // SAM - Single Abstract Method
    public static void main(String[] args) {
        SingleMethod sam1 = new SingleMethod() {
            public void show() {
                System.out.println("Inline implementation");
            }
        };
        sam1.show();

        SingleMethod sam2 = () -> {
            System.out.println("Shorter inline implementation");
        };
        sam2.show();

        SingleMethod sam3 = () -> System.out.println("Too Short one");
        sam3.show();
    }
}
