package com.knoldus.task7;

import java.util.ArrayList;

public class CloneArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        numbers.add(60);

        System.out.println("Original array numbers are : "+numbers);
        ArrayList<Integer> clonedArrayList = (ArrayList<Integer>) numbers.clone();

        System.out.println("Cloned array numbers are : "+clonedArrayList);

    }
}
