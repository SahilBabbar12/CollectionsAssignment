package com.knoldus.task2;

import java.util.ArrayList;

public class ListReplaceExample {
    public static void main(String[] args) {

        // Create an ArrayList with 5 objects
        ArrayList<String> fruitlist = new ArrayList<>();
        fruitlist.add("apple");
        fruitlist.add("banana");
        fruitlist.add("mango");
        fruitlist.add("orange");
        fruitlist.add("Strawberry");


        // Replace all elements with one new fruit
        String newfruit = "watermelon";

        for (int index = 0; index < fruitlist.size(); index++) {
            fruitlist.set(index, newfruit);
        }

        for (String fruit : fruitlist) {
            System.out.println(fruit);
        }

    }
}
