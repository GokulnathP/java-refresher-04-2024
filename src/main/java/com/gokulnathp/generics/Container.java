package com.gokulnathp.generics;

class Store<T> {
    T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return this.value;
    }

    public void show() {
        System.out.println(this.value);
    }
}

public class Container {
    public static void main(String[] args) {
        Store<Integer> integerStore = new Store<>();
        integerStore.set(2);
        integerStore.show();
    }
}
