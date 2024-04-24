package com.gokulnathp.innerclass;

class StaticA {
    static class StaticB {
        int value = 5;
    }
}

public class StaticClass {
    public static void main(String[] args) {
        StaticA.StaticB staticB = new StaticA.StaticB();
        System.out.println(staticB.value);
    }
}
