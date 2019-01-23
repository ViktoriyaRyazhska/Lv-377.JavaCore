package SoftServe.Lesson6.First;

public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Мяу мяу");
    }

    @Override
    public void feed() {
        System.out.println("Я їм віскас");

    }
}
