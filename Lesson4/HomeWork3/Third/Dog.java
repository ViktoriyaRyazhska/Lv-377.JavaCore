package SoftServe.Lesson4.HomeWork3.Third;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static Dog getOldest(Dog dog1, Dog dog2) {
        if (dog1.getAge() > dog2.getAge()) {
            return dog1;
        } else {
            return dog2;
        }
    }
}
