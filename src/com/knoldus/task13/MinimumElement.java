package com.knoldus.task13;

import java.util.*;
public class MinimumElement {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(100);
        numbers.add(55);
        numbers.add(25);
        numbers.add(13);
        numbers.add(15);

        System.out.println("The list is : " + numbers);

         // printing  the minimum element in the list.
        System.out.println("Minimum element in the list is: " + Collections.min(numbers));
    }
}