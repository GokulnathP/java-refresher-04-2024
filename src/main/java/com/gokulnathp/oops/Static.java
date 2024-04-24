package com.gokulnathp.oops;

public class Static {
    public static final int logs = 4;

    static {
        System.out.println("First static block");
    }

    public Static() {
        System.out.println("Constructor block");
    }

    static {
        System.out.println("Second static block");
    }

    public static void log() {
        System.out.println("Hello World from static log " + logs);
    }
}
