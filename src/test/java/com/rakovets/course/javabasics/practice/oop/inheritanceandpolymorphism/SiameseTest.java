package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SiameseTest {
    private static Siamese siamese;

    @Test
    void siameseTest() {
        Siamese siamese = new Siamese("Jony");
        Assertions.assertEquals("Jony",siamese.getName());
        Assertions.assertEquals("mew-mew-mew-mew",siamese.mew());
        Assertions.assertEquals("purr-purr-purr-purr",siamese.purr());
    }

}