package SoftServe.Lesson4.HomeWork3.Third;

public class DogDriver {
    public static void main(String[] Args) {
        Dog rex = new Dog("Рекс", Breed.Collie.name(), 5);
        Dog sharik = new Dog("Шарик", Breed.Beagle.name(), 10);
        Dog iphone = new Dog("Айфон", Breed.Maltipoo.name(), 7);

        int similarDogs = 0;
        similarDogs += rex.name == sharik.name? 1 : 0;
        similarDogs += rex.name == iphone.name? 1 : 0;
        similarDogs += sharik.name == iphone.name? 1 : 0;

        if (similarDogs > 0) {
            System.out.println("There are similar dogs");
        } else {
            System.out.println("There are no similar dogs");
        }

        System.out.println(Dog.getOldest(Dog.getOldest(rex, sharik), iphone).getName());

    }
}
