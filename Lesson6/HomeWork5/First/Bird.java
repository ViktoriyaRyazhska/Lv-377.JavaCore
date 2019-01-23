package SoftServe.Lesson6.HomeWork5.First;

public abstract class Bird {

    boolean feathers;
    boolean layEggs;

    abstract void fly();

    public boolean isFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }
}
