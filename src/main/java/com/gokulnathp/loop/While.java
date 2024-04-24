package com.gokulnathp.loop;

public class While {
    public void log(int n) {
        int i = 0;
        while (i < n) {
            System.out.println(i);
            i++;
        }
    }

    public void doWhile(int n) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < n);
    }
}
