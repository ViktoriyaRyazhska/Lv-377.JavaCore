package com.company;

public class Main {

    public static void main(String[] args) {

        Bird [] birds = new Bird[4];
        birds[0] = new Eagle("З пірря'м", "несуть яйця");
        birds[1] = new Swallow("З пірря'м", "несуть яйця");
        birds[2] = new Penguin("Без пірр'я", "несуть яйця");
        birds[3] = new Chicken("З пірр'ям", "несуть яйця");

        for (int i = 0; i < birds.length; i++) {
            System.out.println(birds[i].getFly());

        }
    }
}
