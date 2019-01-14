package com.company;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Oleg");
        p1.setBirthYear(1976);

        Person p2 = new Person("Igor", 1977);

        Person p3 = new Person();
        p3.setName("Vasyl");
        p3.setBirthYear(1980);

        Person p4 = new Person();
        p4.setName("Volodymyr");
        p4.setBirthYear(1982);

        Person p5 = new Person();
        p5.setName("Ivan");
        p5.setBirthYear(1979);

        p1.getAllFields();
        p2.getAllFields();
        p3.getAllFields();
        p4.getAllFields();
        p5.getAllFields();

        p5 = new Person();
        p5.setName("Ira");

        p5.getAllFields();
    }
}
