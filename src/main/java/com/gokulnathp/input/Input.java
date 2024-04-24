package com.gokulnathp.input;

import java.util.Scanner;

class Phone {
    public String toString() {
        return "Phone";
    }
}

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        System.out.println(line1);

        System.out.println(new Phone());

        System.out.println(scanner.nextInt());
    }
}
