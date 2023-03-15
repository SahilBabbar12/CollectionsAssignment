package com.knoldus.task11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add_Elements {
    public static void main(String a[]) {

        List<String> studentlist = new ArrayList<String>();
        studentlist.add("Sahil");
        studentlist.add("Riya");
        studentlist.add("Mohit");
        System.out.println("List before adding:");
        for (String index : studentlist) {
            System.out.print(index + " ");
        }
        Collections.addAll(studentlist, "Rahul", "jasleen");

        System.out.println("\nAfter adding elements:");
        for (String index : studentlist) {
            System.out.print(index + " ");
        }

    }
}
