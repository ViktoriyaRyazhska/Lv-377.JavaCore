package SoftServe.First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork2 {
    public static void main(String[] Args) {
        String name = null;
        String address = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        try {
            name = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Where are you live, "+ name+"?");
        try {
            address = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Name: "+name+", Address: "+address);
    }
}
