package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.List;

public class MathStatistics {
    public static void main(String[] args) {
//Task 1
        List<Integer> numbers = List.of(0, 1, 2, 3, 4, 5, 5, 5, 6, 7);
        long countEven = numbers.stream()
                .filter(number -> number % 2 == 0)
                .count();

        System.out.println(countEven);
//Task 2
        long countOdd = numbers.stream()
                .filter(number -> number % 2 != 0)
                .count();

        System.out.println(countOdd);
//Task 3
        long countEqual = numbers.stream()
                .filter(number -> number == 0)
                .count();

        System.out.println(countEqual);
//Task 4
        long countRandom = numbers.stream()
                .filter(number -> number == 5)
                .count();

        System.out.println(countRandom);


    }
}
