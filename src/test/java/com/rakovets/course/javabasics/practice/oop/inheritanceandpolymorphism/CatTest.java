package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {
    private static Cat cat;

    @Test
    void catTest() {
        Cat cat = new Cat ("Jony");
        Assertions.assertEquals("Jony", cat.getName());
        Assertions.assertEquals("mew", cat.mew());
        Assertions.assertEquals("purr", cat.purr());
    }
}
