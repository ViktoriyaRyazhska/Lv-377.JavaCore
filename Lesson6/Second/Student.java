package SoftServe.Lesson6.Second;

public class Student extends Person {

    public Student(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("I'm a student "+name);
    }
}
