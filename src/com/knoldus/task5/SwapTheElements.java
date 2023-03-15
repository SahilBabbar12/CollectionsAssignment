package com.knoldus.task5;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTheElements {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);

        System.out.println("Before swapping: " + numbers);

        // Swap elements at index 1 and index 2
        Collections.swap(numbers, 1, 2);

        System.out.println("After swapping: " + numbers);
    }
}

