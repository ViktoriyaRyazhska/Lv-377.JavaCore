package com.company;


public class Person {
    private String Name;
    private int birthdayYear;
    private int age;

    int data = 2019;

    public Person() {
    }

    public Person(String name, int birthdayYear) {
        Name = name;
        this.birthdayYear = birthdayYear;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = setChangeName();
        Name = name;
        if (this.birthdayYear == 0) this.age = 0 - this.birthdayYear;
        else
            this.age = data - this.birthdayYear;
    }

    public void setBirthdayYear(int birthdayYear) {
        this.birthdayYear = birthdayYear;
        if (this.birthdayYear == 0) this.age = 0 - this.birthdayYear;
        else
            this.age = data - this.birthdayYear;
    }

    public String setChangeName() {
        return Name;
    }


    public void getAllFields() {
        System.out.println("Name: " + Name + ", " + "BirthYear: " + birthdayYear + ", " + "Age: " + age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", birthdayYear=" + birthdayYear +
                ", age=" + age +
                '}';
    }
}
