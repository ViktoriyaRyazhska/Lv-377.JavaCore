package com.company;

import java.time.LocalDate;

public class Person {

    private String name;
    private int birthYear;

    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    int data = LocalDate.now().getYear();

    private int age() {
        if (this.birthYear == 0) return 0;
        else
            return data - this.birthYear;
    }

    public void input(String name, int birthYear) {
        this.setName(name);
        this.setBirthYear(birthYear);
    }

    public void getAllFields() {
        System.out.println("Name: " + name + ", " + "BirthYear: " + birthYear + ", " + "Age: " + this.age());

    }
}