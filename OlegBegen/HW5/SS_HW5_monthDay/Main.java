package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("\n" +
                "Please enter the month number");
        int num = scan.nextInt();
        Month month = new Month();
        month.setNumberMonth(num);
        switch (num) {
            case 1:
                month.setDayAmaunt(31);
                month.setName("January");
                break;
            case 2:
                month.setDayAmaunt(28);
                month.setName("February");
                break;
            case 3:
                month.setDayAmaunt(31);
                month.setName("Marth");
                break;
            case 4:
                month.setDayAmaunt(30);
                month.setName("April");
                break;
            case 5:
                month.setDayAmaunt(31);
                month.setName("May");
                break;
            case 6:
                month.setDayAmaunt(30);
                month.setName("June");
                break;
            case 7:
                month.setDayAmaunt(31);
                month.setName("Jule");
                break;
            case 8:
                month.setDayAmaunt(31);
                month.setName("August");

                break;
            case 9:
                month.setDayAmaunt(30);
                month.setName("September");
                break;
            case 10:
                month.setDayAmaunt(31);
                month.setName("October");
                break;
            case 11:
                month.setDayAmaunt(30);
                month.setName("November");
                break;
            case 12:
                month.setDayAmaunt(31);
                month.setName("December");
                break;
            default:

        }
        int md = month.getDayAmaunt();
        int mont[] = new int[md];
        System.out.println(
                "amount of days in " + month.getName() + ": "  + " - " + month.getDayAmaunt());
        for (int i = 0; i < mont.length; i++) {
            mont[i] = i + 1;
            System.out.print(mont[i] + ", ");
        }


    }


}

