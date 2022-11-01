package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> newList = new LinkedList<>();
        for (Integer integer : sourceList) {
            if (integer % 2 == 0) {
                newList.addLast(integer);
            } else {
                newList.addFirst(integer);
            }
        }
        return newList;
    }
}
