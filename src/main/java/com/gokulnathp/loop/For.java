package com.gokulnathp.loop;

public class For {
    public void logN(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    public void labeledBreak() {
        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i == 3) break outer;
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
