package SoftServe.First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork2 {
    public static void main(String[] Args) throws IOException {
        String name;
        String address;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        name = br.readLine();
        System.out.println("Where are you live, "+ name+"?");
        address = br.readLine();
        System.out.println("Name: "+name+", Address: "+address);
    }
}
