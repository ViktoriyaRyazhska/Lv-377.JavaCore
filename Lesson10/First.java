package MyPractices.Lesson10;

public class First {
    public static void main(String[] args) {
        Thread studyJava = new Core(1000, 10, "I study Java");
        Thread helloWorld = new Core(2000, 5, "Hello World");
        Thread peaceThePeace = new Core(3000, 5, "Peace in the peace");

        studyJava.start();
        helloWorld.start();
        peaceThePeace.start();

        try {
            studyJava.join();
            helloWorld.join();
            peaceThePeace.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My name is...");
    }
}
