package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortNames {
    public ArrayList<String> getNamesSorted(String name) {
        if (name == null) {
            return null;
        } else {
            TreeSet<String> sortedSet = new TreeSet<>(Arrays.asList(name.split(" ")));
            return new ArrayList<String>(sortedSet);
        }
    }
}
