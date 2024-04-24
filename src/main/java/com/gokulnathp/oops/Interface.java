package com.gokulnathp.oops;

interface InterfaceA {
    public static void name() {
        System.out.println("Interface A");
    }

    public default void version() {
        System.out.println("v1.0.0");
    }

    public void show();
}

interface InterfaceC {
    public void display();
}

interface InterfaceD extends InterfaceA, InterfaceC {
    public void nothing();
}

class InterfaceB implements InterfaceC, InterfaceA {
    public void show() {
        System.out.println("B");
    }

    public void display() {
        System.out.println("B Display");
    }
}

public class Interface {
    public static void main(String[] args) {
        InterfaceA obj1 = new InterfaceB();
        obj1.show();
        obj1.version();
        InterfaceA.name();

        InterfaceC obj2 = new InterfaceB();
        obj2.display();

        InterfaceB obj3 = new InterfaceB();
        obj3.show();
        obj3.display();

    }
}
