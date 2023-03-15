package com.knoldus.task1;

import java.util.LinkedList;

public class ConvertLinkedlistToArray {
    public static void main(String[] args) {

        // Create a LinkedList with 5 students
        LinkedList<String> studentlist = new LinkedList<>();
        studentlist.add("Sahil");
        studentlist.add("Riya");
        studentlist.add("Pradyuman");
        studentlist.add("Jasleen");
        studentlist.add("Rahul");

        // Convert the LinkedList to an Array
        String[] student_array = studentlist.toArray(new String[0]);


        for (String student : student_array) {
            System.out.println(student);
        }
    }
}

