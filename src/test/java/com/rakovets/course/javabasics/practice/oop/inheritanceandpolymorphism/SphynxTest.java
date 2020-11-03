package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SphynxTest {
    private static Sphynx sphynx;

    @Test
    void sphynxTest() {
        Sphynx sphynx = new Sphynx("Jony");
        Assertions.assertEquals("Jony",sphynx.getName());
        Assertions.assertEquals("mew-mew",sphynx.mew());
        Assertions.assertEquals("purr-purr",sphynx.purr());
    }

}