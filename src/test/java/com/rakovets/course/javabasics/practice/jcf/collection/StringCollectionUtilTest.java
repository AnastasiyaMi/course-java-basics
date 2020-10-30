package com.rakovets.course.javabasics.practice.jcf.collection;
import static org.junit.jupiter.api.Assertions.*;

import com.rakovets.course.javabasics.example.collections.StringCollectionUtil;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class StringCollectionUtilTest {
    @Test
    void resetWordsByLengthTest () {
        String [] array = new String [] {"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"};
        String[] test = new String[]{"this", "*", "lots", "*", "fun", "for", "every", "Java", "programmer"};
        ArrayList<String> list = new ArrayList<>();
        for (String string : array) {
            list.add(string);
        }
        StringCollectionUtil.resetWordsByLength(list, 2);
        assertArrayEquals(test, list.toArray());
    }
}
