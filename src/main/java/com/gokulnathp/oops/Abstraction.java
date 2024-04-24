package com.gokulnathp.oops;

abstract class Phone {
    public String name() {
        return "Phone";
    }

    abstract public void show();
}

class Samsung extends Phone {
    public void show() {
        System.out.println("Samsung " + super.name());
    }
}

class IPhone extends Phone {
    public void show() {
        System.out.println("IPhone");
    }
}

public class Abstraction {
    public static void showConfig(Phone phone) {
        phone.show();
    }

    public static void main(String[] args) {
        showConfig(new IPhone());
        showConfig(new Samsung());
    }
}
