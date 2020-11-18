package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Main {
    public static void main(String[] args) {
        Task4 task = new Task4();

        try {
            task.sayHello();
            task.callException();
        } catch (MyOwnException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
