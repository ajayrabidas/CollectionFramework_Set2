package com.example.string;

// Make collections ReadOnly such that it cannot be modified

import java.util.*;

public class UnmodifiableCollection {

    public static void main(String[] args) {
        UnmodifiableCollection um = new UnmodifiableCollection();

        System.out.println("Modifying unmodifiable List" + um.demoUnmodifiableList());
        System.out.println("Modifying unmodifiable Set" + um.demoUnmodifiableSet());
        System.out.println("Modifying unmodifiable Map" + um.demoUnmodifiableMap());
    }

    public List<String> demoUnmodifiableList() {
        List<String> li = new ArrayList<>();
        li.add("A");
        li.add("B");
        li.add("C");
        li.add("D");

        List<String> liFixed = Collections.unmodifiableList(li);
        try {
            liFixed.add("Z");
        } catch (UnsupportedOperationException e) {
            System.out.println("Unsupported Operation Exception occurred: " + e);
        }

        return liFixed;
    }

    public Set<String> demoUnmodifiableSet() {
        Set<String> se = new HashSet<>();
        se.add("P");
        se.add("Q");
        se.add("R");
        se.add("S");

        Set<String> seFixed = Collections.unmodifiableSet(se);
        try {
            seFixed.add("T");
        } catch (UnsupportedOperationException e) {
            System.out.println("Unsupported Operation Exception occurred: " + e);
        }

        return seFixed;
    }

    public Map<String, Integer> demoUnmodifiableMap() {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Table", 1);
        mp.put("Chair", 2);
        mp.put("Desk", 3);

        Map<String, Integer> mpFixed = Collections.unmodifiableMap(mp);
        try {
            mp.put("Sofa", 4);
        } catch (UnsupportedOperationException e) {
            System.out.println("Unsupported Operation Exception occurred: " + e);
        }

        return mpFixed;
    }


}
