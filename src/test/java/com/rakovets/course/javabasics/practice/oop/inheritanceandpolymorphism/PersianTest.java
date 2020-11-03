package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersianTest {
    private static Persian persian;

    @Test
    void persianTest() {
        Persian persian = new Persian("Jony");
        Assertions.assertEquals("Jony",persian.getName());
        Assertions.assertEquals("mew-mew-mew",persian.mew());
        Assertions.assertEquals("purr-purr-purr",persian.purr());
    }

}
