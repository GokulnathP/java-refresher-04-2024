package com.gokulnathp.oops;

class Animal {
    protected int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("I can walk using " + legs + " legs");
    }

    public void sound() {
        System.out.println("I am animal");
    }
}

class Bird extends Animal {
    public Bird(int legs) {
        super(legs);
    }

    public void fly() {
        System.out.println("I can fly");
    }
}

class Crow extends Bird {
    public Crow() {
        super(2);
    }

    public void sound() {
        super.sound();
        System.out.println("crow... crow...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Crow crow = new Crow();
        crow.sound();
        crow.fly();
        crow.walk();
    }
}
