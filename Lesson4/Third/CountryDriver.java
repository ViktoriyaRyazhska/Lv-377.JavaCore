package SoftServe.Lesson4.Third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountryDriver {
    public static void main(String[] Args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name of the country");

        String Country = br.readLine();

        getContinent(Country);
    }

    static void getContinent(String Country){
        switch (Country.toUpperCase()) {
            case "GERMANY":
            case "FRANCE":
            case "UKRAINE":
                System.out.println(Continents.EUROPE);
                break;

            case "RUSSIA":
            case "CHINA":
                System.out.println(Continents.ASIA);
                break;

            case "CANADA":
            case "AMERICA":
                System.out.println(Continents.AMERICA);
                break;

            case "AUSTRALIA":
                System.out.println(Continents.AUSTRALIA);
                break;

            case "ETHIOPIA": case "EGYPT":
                System.out.println(Continents.AFRICA);
                break;

            default:
                System.out.println(Continents.ANTARCTICA);
                break;
        }
    }
}
