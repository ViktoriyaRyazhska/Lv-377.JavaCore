package com.company;


import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private Integer kurs;


    public Student() {
    }

    public Student(String name, Integer kurs) {
        this.name = name;
        this.kurs = kurs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getKurs() {
        return kurs;
    }

    public void setKurs(Integer kurs) {
        this.kurs = kurs;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", kurs=" + kurs +
                '}';
    }

    public static void infoStudents(List<Student> students) {
        for (Iterator<Student> i = students.iterator(); i.hasNext(); ) {
            Student stud = i.next();
            //System.out.println(i.next());
            //System.out.println(i.next().getName() + i.next().getKurs()); чому так не друкує?
            System.out.println("Name: " + stud.getName() + ", Kurs: " + stud.getKurs());
        }
    }

    public static void printStudentsKurs(List<Student> students, int kurs) {
        int studentKurs = kurs;
        if (kurs > 5) System.out.println("No such course found");
        for (Iterator<Student> it = students.iterator(); it.hasNext(); ) {
            Student stud = it.next();
            if (stud.kurs == kurs) {
                System.out.println("course students: " + studentKurs + " " + stud.getName() + ",");
            }
        }
    }
}




