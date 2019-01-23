package SoftServe.Lesson6.First;

public class AnimalDriver {
    public static void main(String[] Args) {
        Animal mika = new Cat();
        Animal bars = new Cat();
        Animal rex = new Dog();
        Animal adolf = new Dog();

        Animal[] zoo = {mika, bars, rex, adolf};

        for (int i = 0; i < zoo.length; i++) {
            zoo[i].feed();
            zoo[i].voice();
        }
    }
}
