package SoftServe.Second.HomeWork;

import java.time.LocalDate;

public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person() {
    }

    public int age(){
        return LocalDate.now().getYear() - birthYear;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void input(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String output() {
        return "Name: "+name+" the birthday year "+birthYear+" age: "+age();
    }
}
