package com.trepudox.datastructure.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetRev {

    private static final Set<Integer> set = new HashSet<>();

    static {
        set.addAll(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }

    public static void main(String[] args) {
        System.out.println("set.isEmpty() - " + set.isEmpty());

        System.out.println(set.containsAll(Set.of(4, 5, 6)));

        System.out.println(set);
        set.retainAll(Set.of(4, 5, 6));
        System.out.println(set);

        System.out.println();

    }

}
