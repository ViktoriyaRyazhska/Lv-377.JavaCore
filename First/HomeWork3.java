package SoftServe.First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork3 {
    public static void main(String[] Args) {
        double c1 = 0, c2 = 0, c3 = 0, t1 = 0, t2 = 0, t3 = 0, phoneCall_c1_Price, phoneCall_c2_Price, phoneCall_c3_Price, totalPrice;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a price for a phone call c1");
        try {
            c1 = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("Enter a price for a phone call c2");
        try {
            c2 = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("Enter a price for a phone call c3");
        try {
            c3 = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("Enter duration t1 for c1");
        try {
            t1 = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("Enter duration t2 for c2");
        try {
            t2 = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("Enter duration t3 for c3");
        try {
            t3 = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        phoneCall_c1_Price = c1 * t1;
        phoneCall_c2_Price = c2 * t2;
        phoneCall_c3_Price = c3 * t3;
        totalPrice = phoneCall_c1_Price + phoneCall_c2_Price + phoneCall_c3_Price;

        System.out.println("Phone Call 1 = "+phoneCall_c1_Price);
        System.out.println("Phone Call 2 = "+phoneCall_c2_Price);
        System.out.println("Phone Call 3 = "+phoneCall_c3_Price);
        System.out.println("Total price = "+totalPrice);
    }
}
