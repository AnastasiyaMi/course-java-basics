package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Task 1

public class CityHelper {
    public static void main(String[] args) {
        List<String> city = Arrays.asList("Moscow", "Minsk", "Grodno", "Minsk", "Moscow", "Minsk", "Vitebsk");
        List<String> uniqueCity =
                city
                        .stream()
                        .distinct()
                        .collect(Collectors.toList());
        System.out.println(uniqueCity);

//Task 2
        city.stream()
                .filter(s -> s.length() > 6)
                .forEach(System.out::println);

//Task 3
        city.stream()
                .filter(city1 -> city1.startsWith("G"))
                .forEach(System.out::println);

//Task 4

        long repeatElements = (long) city.stream()
                .filter(city2 -> city2.equals("Minsk"))
                .count();
        System.out.println(repeatElements);
    }


}
