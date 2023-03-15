package com.knoldus.task12;

import java.util.LinkedList;

public class RetrieveFirstElement {
    public static void main(String[] args)
    {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);

        System.out.println("The given list is:");
        for(Integer index: numbers)
        {
            System.out.print(index+ " ");
        }

        System.out.println("\nfirst element by using peek method  "+numbers.peek());
        System.out.println("first element by getFirst method: "+numbers.getFirst());
        System.out.println("first element by peekFirst method: "+numbers.peekFirst());
    }
}
