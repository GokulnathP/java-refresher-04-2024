package com.gokulnathp.thread;

class Util {
    public static void sleepFor(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class RunnableUser implements Runnable {
    public void run() {
        System.out.println("Running...");
    }
}

public class RunnableInterface {
    public static void main(String[] args) throws InterruptedException {
        RunnableUser runnableUser = new RunnableUser();
        new Thread(runnableUser).start();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                Util.sleepFor(1000);
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 4; i++) {
                System.out.println("Hi");
                Util.sleepFor(1500);
            }
        });

        t1.start();
        t2.start();

        System.out.println("Before they complete " + Thread.currentThread().getName());
        t1.join();
        t2.join();
        System.out.println("After they complete");
    }
}
