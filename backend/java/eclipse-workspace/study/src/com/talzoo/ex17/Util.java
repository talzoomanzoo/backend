package com.talzoo.ex17;

public class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2 ) { // p1,p2 서로 다른 pair 객체
        boolean keyCompare = p1.getKey().equals(p2.getKey());
        boolean valueCompare = p1.getValue().equals(p2.getValue());

        return keyCompare && valueCompare; // 두개가 같은 것이 참이면 true, 두개가 다르면 false
    }
}
