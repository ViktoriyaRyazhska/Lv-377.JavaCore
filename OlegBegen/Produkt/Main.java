package com.company;

public class Main {


    public static void main(String[] args) {
        Produkt p1 = new Produkt();
        p1.name = "Beer";
        p1.price = 4.50;
        p1.quantity = 20;
        Produkt p2 = new Produkt();
        p2.name = "Bread";
        p2.price = 1.90;
        p2.quantity = 40;
        Produkt p3 = new Produkt();
        p3.name = "Water";
        p3.price = 2.00;
        p3.quantity = 30;
        Produkt p4 = new Produkt();
        p4.name = "Butter";
        p4.price = 3.20;
        p4.quantity = 15;

        System.out.println(p1.getName() + ", " + p1.getPrice() + "," + p1.getQuantity());


    }

    static Produkt getProduktHPaice(double price) {
        double x;
        if (p1.getPrice() > p2.getPrice()) {
            x = p1.getPrice();
        } else x = p2.getPrice();
        if (p1.getPrice() > p3.getPrice()) {
            x = p1.getPrice();
        } else x = p3.getPrice();
        if (p1.getPrice() > p4.getPrice()) {
            x = p1.getPrice();
        } else x = p4.getPrice();
        if (p2.getPrice() > p1.getPrice()) {
            x = p2.getPrice();
        } else x = p1.getPrice();
        if (p2.getPrice() > p3.getPrice()) {
            x = p2.getPrice();
        } else x = p3.getPrice();
        if (p2.getPrice() > p4.getPrice()) {
            x = p2.getPrice();
        } else x = p4.getPrice();
        if (p3.getPrice() > p1.getPrice()) {
            x = p3.getPrice();
        } else x = p1.getPrice();
        if (p3.getPrice() > p2.getPrice()) {
            x = p3.getPrice();
        } else x = p2.getPrice();
        if (p3.getPrice() > p4.getPrice()) {
            x = p3.getPrice();
        } else x = p4.getPrice();
        if (p4.getPrice() > p1.getPrice()) {
            x = p4.getPrice();
        } else x = p1.getPrice();
        if (p4.getPrice() > p2.getPrice()) {
            x = p4.getPrice();
        } else x = p2.getPrice();
        if (p4.getPrice() > p3.getPrice()) {
            x = p4.getPrice();
        } else x = p3.getPrice();
        return getProduktHPaice(x);
    }

}
