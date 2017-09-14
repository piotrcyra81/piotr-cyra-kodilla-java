package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(n -> System.out.println(n));

        double avgOfNumbers = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();

        System.out.println("avg Of Numbers " + avgOfNumbers);
        return avgOfNumbers;
    }
}