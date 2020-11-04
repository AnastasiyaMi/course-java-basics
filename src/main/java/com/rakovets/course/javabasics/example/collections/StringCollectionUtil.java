package com.rakovets.course.javabasics.example.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class StringCollectionUtil {
    public static Collection<String> resetWordsByLength(Collection<String> collection, int length) {
        Collection<String> changedCollection = new ArrayList<String>();
        String character = "*";
        for (String str : collection) {
            String result = str.length() == length ? character : str;
            changedCollection.add(result);
        }
        return changedCollection;
    }

    public static Collection<String> removeWordsByLength(Collection<String> list, int length) {
        Collection<String> newList = new ArrayList<String>();
        for (String str : list) {
            if (str.length() != length) {
                newList.add(str);
            }
        }
        return newList;
    }

}

