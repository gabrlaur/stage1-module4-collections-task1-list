package com.epam.mjc.collections.list;

import java.util.*;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        return Math.pow(intA, 2) < Math.pow(intB, 2) ? -1 : Math.pow(intA, 2) == Math.pow(intB, 2) ? intA > intB ? 1 : -1 : 1;
    }
}
