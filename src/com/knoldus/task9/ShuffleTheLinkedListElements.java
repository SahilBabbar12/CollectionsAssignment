package com.knoldus.task9;

import java.util.Collections;
import java.util.LinkedList;

public class ShuffleTheLinkedListElements
{
    public static void main(String[] args)
    {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(20);
        numbers.add(19);
        numbers.add(14);
        numbers.add(17);
        numbers.add(13);
        numbers.add(12);

        System.out.println("Before shuffling elements: ");
        for(Integer element: numbers)
        {
            System.out.print(element+" ");
        }
        Collections.shuffle(numbers);

        System.out.println("\nAfter shuffling elements: ");
        for(Integer element: numbers)
        {
            System.out.print(element+" ");
        }
    }
}
