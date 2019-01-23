package SoftServe.Lesson6.Second;

public class Cleaner extends Stuff {
    public Cleaner(String name) {
        super(name);
    }

    @Override
    void salary() {
        System.out.println("I have salary ");
    }

    @Override
    void print() {
        System.out.println("I'm cleaner "+name);
    }
}
