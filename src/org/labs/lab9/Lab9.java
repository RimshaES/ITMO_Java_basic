package org.labs.lab9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import static java.lang.System.currentTimeMillis;

public class Lab9 {
    public static Collection<String> removeDuplicates(Collection<String> col) {
        Set<String> set = new HashSet<>(col);
        return set;
    }


    public static void testList(List<Integer> list) {

        for (int i = 0; i < 1_000_000; i++) {
            list.add(i + 1);
        }
        System.out.println("");

        long start = currentTimeMillis();
        Random random = new Random();

        List<Integer> newList = new ArrayList<>(100_000);
        for (int i = 0; i < 100_000; i++) {
            newList.add(list.get(random.nextInt(0, 1_000_000)));
        }
        long end = currentTimeMillis();
        long result = end - start;
        System.out.println("Время выборки: " + result + " ms для списка типа " + list.getClass());
    }

}
