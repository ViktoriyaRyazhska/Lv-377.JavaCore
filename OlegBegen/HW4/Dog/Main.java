package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("REX", Breed.VIVCHARKA, 3);
        Dog dog2 = new Dog("ARTEMON", Breed.PUDEL, 5);
        Dog dog3 = new Dog("rex", Breed.TAKSA, 10);


        int sameName = 0;
        sameName = dog1.getName() == dog2.getName()? 1 : 0;
        sameName = dog1.getName() == dog3.getName()? 1 : 0;
        sameName = dog2.getName() == dog3.getName()? 1 : 0;

        if (sameName >= 0) {
            System.out.println("There are two dogs with the same name");
        } else {
            System.out.println("No dogs with the same name");
        }

        System.out.println(oldestDog(dog1, dog2, dog3).nameAndKind());
    }


    static Dog oldestDog(Dog d1, Dog d2, Dog d3) {
        if (d1.getAge() > d2.getAge() && d1.getAge() > d3.getAge()) {
            return d1;
        } else if (d2.getAge() > d3.getAge()) {
            return d2;
        } else return d3;
    }
}



