package com.gokulnathp.thread;

class Product {
    int number;
    boolean valueSet = false;

    public synchronized void put(int number) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.number = number;
        this.valueSet = true;
        notify();
    }

    public synchronized void get() {
        while(!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(number);
        valueSet = false;
        notify();
    }
}

class Producer implements Runnable {
    Product product;

    Producer(Product product) {
        this.product = product;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int timer = 0;
        while(true) {
            product.put(timer++);
            Util.sleepFor(1000);
        }
    }
}

class Consumer implements Runnable {
    Product product;

    Consumer(Product product) {
        this.product = product;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while(true) {
            product.get();
            Util.sleepFor(2000);
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        Product product = new Product();
        new Producer(product);
        new Consumer(product);
    }
}
