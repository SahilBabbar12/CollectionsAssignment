package com.knoldus.task4;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        // Create a LinkedHashSet with 5 students
        LinkedHashSet<String> student_set = new LinkedHashSet<>();
        student_set.add("Sahil");
        student_set.add("Riya");
        student_set.add("Jasleen");
        student_set.add("Rahul");
        student_set.add("Mohit");

        System.out.println( "Original student set: "+student_set);

        // Remove an element from the set
        student_set.remove("Sahil");

        System.out.println("New student set: " + student_set);
    }
}
