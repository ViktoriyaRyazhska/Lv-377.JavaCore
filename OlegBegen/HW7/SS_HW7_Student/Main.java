package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Oleg", 1));
        students.add(new Student("Ira", 3));
        students.add(new Student("Olga", 5));
        students.add(new Student("Igor", 2));
        students.add(new Student("Vova", 1));


        Student.infoStudents(students);
        students.sort(new NameComparator());
        System.out.println("__________________");
        Student.infoStudents(students);
        students.sort(new kursComparator());
        System.out.println("__________________");
        Student.infoStudents(students);
        System.out.println("__________________");
       Student.printStudentsKurs(students, 1);
    }
}
