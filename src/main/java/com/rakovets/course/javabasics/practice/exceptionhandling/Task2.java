package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task2 {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[5];
            numbers[6] = 145;
            System.out.println(numbers[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
        } finally {
            System.out.println("Out of bounds of array");
        }

    }
}
