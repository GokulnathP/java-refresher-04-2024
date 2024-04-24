package com.gokulnathp.variables;

public class Types {
    byte aByte = 1;
    char aChar = '2';
    short aShort = 2;
    int anInt = 4;
    float aFloat = 4;
    long aLong = 8;
    double aDouble = 8;
    boolean aBoolean = true;

    // single line command
    /* multi line command */
    /**
     * documentation command
     */

    char c = 'a';
    int i = (char) c; // type casting

    public void log() {
        System.out.print("This will be printed. ");
        System.out.println("Print with line break");
        System.out.printf("The sum %d and %d is %d", 1, 2, 1 + 2);
    }
}
