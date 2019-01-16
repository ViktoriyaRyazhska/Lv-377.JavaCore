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


        System.out.println("The most expensive - " + getProduktHPaice(p1,p2,p3,p4).nameAndQuantity());
        System.out.println("The biggest quantity - " + getBiggestquantity(p1, p2, p3, p4).nameAndQuantity());
    }

    static Produkt getProduktHPaice(Produkt p1, Produkt p2, Produkt p3, Produkt p4) {
        if (p1.getPrice() > p2.getPrice() && p1.getPrice() > p3.getPrice() && p1.getPrice() > p4.getPrice()) {
            return p1;
        } else if (p2.getPrice() > p3.getPrice() && p2.getPrice() > p4.getPrice()){return p2;
        } else if (p3.getPrice() > p4.getPrice()){return p3;
        } else return p4;}

    static Produkt getBiggestquantity(Produkt p1,Produkt p2, Produkt p3, Produkt p4) {
        if (p1.getQuantity() > p2.getQuantity() && p1.getQuantity() > p3.getQuantity() && p1.getQuantity() > p4.getQuantity()) {
            return p1;
        } else if (p2.getQuantity() > p3.getQuantity() && p2.getQuantity() > p4.getQuantity()){return p2;
        } else if (p3.getQuantity() > p4.getQuantity()){return p3;
        } else return p4;}
    }


