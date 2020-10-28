package com.rakovets.course.javabasics.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PairUtilTest {
    @Test
    void swapTest () {
        PairUtil<String,Integer> stringIntegerPairUtil = new PairUtil <> ();
        Pair<String, Integer> origin = new Pair ("123", 123);
        Pair<Integer, String> swapped = stringIntegerPairUtil.swap(origin);
        Assertions.assertEquals(origin.getKey(), swapped.getValue());
        Assertions.assertEquals(origin.getValue(), swapped.getKey());
    }
}
