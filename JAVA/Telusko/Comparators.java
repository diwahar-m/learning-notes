package JAVA.Telusko;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age,String name){
        this.age = age;
        this.name = name;
    }
}

public class Comparators {
    public static void main(String[] args) {
        
        // Comparator is a FI 
        // so, we using lampda expression here
        Comparator<Student> com = (i,j) -> i.age > j.age ? 1: -1;  

        List<Student> studs = new ArrayList<>(); 

        studs.add(new Student(21, "John")); 
        studs.add(new Student(70, "wick")); 
        studs.add(new Student(34, "mol"));
        studs.add(new Student(9, "eddie"));

        System.out.println(studs);
    }
}
