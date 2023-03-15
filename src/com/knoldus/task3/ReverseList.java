package com.knoldus.task3;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {
    public static void main(String[] args) {

        // Create an ArrayList with 5 numbers
        ArrayList<Integer> numberlist = new ArrayList<>();
        numberlist.add(10);
        numberlist.add(20);
        numberlist.add(30);
        numberlist.add(40);
        numberlist.add(50);

        System.out.println("Original List: "+ numberlist);

        // Reverse the numberlist
        Collections.reverse(numberlist);

        System.out.println("Reversed List"+ numberlist);
    }
}

