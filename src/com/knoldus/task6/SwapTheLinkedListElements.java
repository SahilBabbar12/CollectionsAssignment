package com.knoldus.task6;

import java.util.LinkedList;

public class SwapTheLinkedListElements {
    public static void main(String[] args) {

        // Create a LinkedList with some elements
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        System.out.println("Before swapping : " + numbers);

        // Swap the second and fourth number in the list
        int numberatSecondPosition = numbers.get(1);
        int numberatfourthPositon= numbers.get(3);
        numbers.set(1, numberatfourthPositon);
        numbers.set(3, numberatSecondPosition);

        System.out.println("After swapping : " + numbers);

    }
}
