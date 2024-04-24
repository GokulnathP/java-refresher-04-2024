package com.gokulnathp.thread;

class ThreadLog extends Thread {
    public void run() {
        System.out.println("Log from " + Thread.currentThread().getName());
        Util.sleepFor(1000);
        System.out.println("Log from " + Thread.currentThread().getName());
        Util.sleepFor(500);
        System.out.println("Log from " + Thread.currentThread().getName());
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        ThreadLog thread1 = new ThreadLog();
        ThreadLog thread2 = new ThreadLog();

        thread1.setName("Thread 1");
        thread2.setName("Thread 2");

        thread1.start();
        thread2.start();
    }
}
