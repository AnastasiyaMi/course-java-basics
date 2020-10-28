package com.rakovets.course.javabasics.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {
    @Test
    void getMaxParamsFrom3Test () {
        Assertions.assertEquals(100.01, Math.max(99.99,100.00, 100.01));
        Assertions.assertEquals(-99.99, Math.max(-99.99,-100.00, -100.01));
        Assertions.assertEquals("xyz", Math.max("abc","def", "xyz"));
        Assertions.assertEquals("XYZ", Math.max("ABC","DEF", "XYZ"));
        Assertions.assertEquals("0", Math.max("0","0", "0"));
    }

    @Test
    void getMinParamsFrom5Test () {
        Assertions.assertEquals(90.99, Math.min(99.99,100.00, 100.01, 90.99, 100.10));
        Assertions.assertEquals(-100.10, Math.min(-99.99,-100.00, -100.01, -100.10, -100.02));
        Assertions.assertEquals("abc", Math.min("abc","def", "xyz", "qrs", "klm"));
        Assertions.assertEquals("ABC", Math.min("ABC","DEF", "XYZ", "QRS", "KLM"));
        Assertions.assertEquals(0, Math.min(0, 0, 0, 0, 0));
    }

    @Test
    void getArrayMaxTest () {
        Assertions.assertEquals(100.01, Math.arrayMax(new Double[] {99.99,100.00, 100.01} ));
        Assertions.assertEquals(-99.99, Math.arrayMax(new Double[] {-99.99,-100.00, -100.01} ));
        Assertions.assertEquals("xyz", Math.arrayMax(new String[] {"abc","def", "xyz"} ));
        Assertions.assertEquals("XYZ", Math.arrayMax(new String[] {"ABC","DEF", "XYZ"} ));
        Assertions.assertEquals(101, Math.arrayMax(new Integer[] {99, 0, 100, 101} ));
    }

    @Test
    void getArrayMinTest () {
        Assertions.assertEquals(99.99, Math.arrayMin(new Double[] {99.99,100.00, 100.01} ));
        Assertions.assertEquals(-100.01, Math.arrayMin(new Double[] {-99.99,-100.00, -100.01} ));
        Assertions.assertEquals("abc", Math.arrayMin(new String[] {"abc","def", "xyz"} ));
        Assertions.assertEquals("ABC", Math.arrayMin(new String[] {"ABC","DEF", "XYZ"} ));
        Assertions.assertEquals(0, Math.arrayMin(new Integer[] {99, 0, 100, 101} ));
    }
    @Test
    void getArraySortTest () {
        Assertions.assertEquals(new Double[]{9.9, 9.99, 10.0}, Math.arraySort(new Double[]{9.9, 10.0, 9.99}));
        Assertions.assertEquals(new Integer[] {99, 100, 101, 105, 999}, Math.arraySort(new Integer[] {999, 101, 105, 100, 99}));
        Assertions.assertEquals (new Integer[] {-8, -5, -2, -1, 0}, Math.arraySort(new Integer[] {-5, -8, -1, -2, 0}));
        Assertions.assertEquals (new String[] {"a", "b", "c", "d", "e"}, Math.arraySort(new String[] {"e", "d", "b", "c", "a"}));


    }

}
