package com.rakovets.course.javabasics.practice.exceptionhandling;

public class MyOwnException extends RuntimeException {
    public MyOwnException(String message) {
        super(message);
    }
}
