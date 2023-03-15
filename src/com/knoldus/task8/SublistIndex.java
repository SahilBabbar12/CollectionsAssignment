package com.knoldus.task8;

import java.util.ArrayList;
import java.util.Collections;

public class SublistIndex {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        ArrayList<Integer> subList = new ArrayList<>();
        subList.add(6);
        subList.add(7);
        subList.add(8);

        Integer index = Collections.indexOfSubList(list, subList);

        System.out.println("Index of the sublist in the main list is : " + index);
    }
}
