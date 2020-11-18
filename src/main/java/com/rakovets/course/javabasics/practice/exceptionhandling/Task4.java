package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task4 {
    public void sayHello() {
        System.out.println("Hello world");
    }

    public void callException() {
        throw new MyOwnException("something went wrong");
    }
}
