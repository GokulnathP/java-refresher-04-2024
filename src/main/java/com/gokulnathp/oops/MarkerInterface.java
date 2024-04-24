package com.gokulnathp.oops;

interface Accessible {}

class User implements Accessible {
    public void show() {
        System.out.println("Hi");
    }
}

public class MarkerInterface {
    public static void main(String[] args) {
        User user = new User();

        if(user instanceof Accessible) {
            user.show();
        }
    }
}
