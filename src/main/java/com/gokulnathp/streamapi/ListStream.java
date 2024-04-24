package com.gokulnathp.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListStream {
    public static void doubleIt(Integer number) {
        System.out.print((number * 2) + " ");
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer);
            }
        });
        System.out.println();

        numbers.forEach((number) -> System.out.print(number));
        System.out.println();

        numbers.forEach(System.out::print);
        System.out.println();

        numbers.forEach(ListStream::doubleIt);
        System.out.println();

        System.out.println(
                numbers.stream()
                        .map(number -> number * 2)
                        .filter(number -> number % 3 == 0)
                        .reduce(0, Integer::sum)
        );

        System.out.println(
                numbers.stream()
                        .filter(number -> number % 2 == 0)
                        .map(number -> number * 2)
                        .findFirst()
                        .orElse(0)
        );
    }
}
