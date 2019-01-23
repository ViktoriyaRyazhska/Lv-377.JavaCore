package SoftServe.Lesson6.First;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Гав гав");
    }

    @Override
    public void feed() {
        System.out.println("Я їм кості");
    }
}
