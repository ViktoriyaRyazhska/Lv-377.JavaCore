package SoftServe.Lesson6.HomeWork5.First;

public class BirdDriver {
    public static void main(String[] Args) {
        Bird[] birds = {new Eagle(), new Swallow(), new Penguin(), new Chicken()};
        for (Bird bird : birds) {
            System.out.println(bird);
            bird.fly();
        }
    }
}
