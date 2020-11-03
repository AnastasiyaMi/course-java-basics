package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    private static Person person;

    @Test
    void personTest() {
        Person person = new Person(10);
        Assertions.assertEquals(12.00, person.changeHappiness(2));
    }
}
