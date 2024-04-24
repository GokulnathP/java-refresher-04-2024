package com.gokulnathp.oops;

class MethodOverloading {
    public void show() {
        System.out.println("Shows nothing");
    }

    public void show(String text) {
        System.out.println("Shows text " + text);
    }
}

class MethodOverridingBase {
    public void show() {
        System.out.println("Base show");
    }
}

class MethodOverriding extends MethodOverridingBase {
    public void show() {
        System.out.println("Child show");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();

        methodOverloading.show();
        methodOverloading.show("Hello World");

        MethodOverridingBase methodOverridingBase = new MethodOverriding();
        methodOverridingBase.show();
    }
}
