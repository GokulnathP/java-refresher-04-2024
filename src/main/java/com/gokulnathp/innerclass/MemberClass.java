package com.gokulnathp.innerclass;

class MemberA {
    class MemberB {
        int value = 10;
    }
}

public class MemberClass {
    public static void main(String[] args) {
        MemberA memberA = new MemberA();
        MemberA.MemberB memberB = memberA.new MemberB();
        System.out.println(memberB.value);
    }
}
