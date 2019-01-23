package SoftServe.Lesson6.Second;

public class Teacher extends Stuff {
    public Teacher(String name) {
        super(name);
    }

    @Override
    void salary() {
        System.out.println("I have salary ");
    }

    @Override
    void print() {
        System.out.println("I'm a teacher "+name);
    }
}
