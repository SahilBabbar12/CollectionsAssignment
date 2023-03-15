package com.knoldus.task10;

import java.util.LinkedHashSet;

class Student
{
    String name;
    Integer id;
    Student(String name, Integer id)
    {
        this.name = name;
        this.id = id;
    }

    //overriding hashCode function
    @Override
    public int hashCode(){
        System.out.println("In hashcode");
        int hashcode = 0;
        hashcode = id*20;
        hashcode += name.hashCode();
        return hashcode;
    }

    //overriding equals function to compare elements
    @Override
    public boolean equals(Object object)
    {
        System.out.println("In equals");
        if (object instanceof Student)
        {
            Student student = (Student) object;
            return (student.name.equals(this.name) && student.id == this.id);
        }
        else
        {
            return false;
        }
    }
}

public class Remove_Duplicates {
    public static void main(String[] args) {
        LinkedHashSet<Student> StudentSet = new LinkedHashSet<>();
        StudentSet.add(new Student("Sahil", 10));
        StudentSet.add(new Student("Mohit", 40));
        StudentSet.add(new Student("Sahil", 30));
        StudentSet.add(new Student("Riya", 20));

        for (Student student : StudentSet) {
            System.out.println(student.name + " " + student.id);
        }

    }
}
