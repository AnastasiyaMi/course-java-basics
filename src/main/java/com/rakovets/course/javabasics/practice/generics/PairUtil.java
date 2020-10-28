package com.rakovets.course.javabasics.util;

public final class PairUtil <K,V> {
    public Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<>(pair.getValue(), pair.getKey());
    }
}
