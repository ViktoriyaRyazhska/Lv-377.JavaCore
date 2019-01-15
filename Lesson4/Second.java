package SoftServe.Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Second {
    public static void main(String[] Args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of the day of the week from 1 to 7");
        int A = Integer.parseInt(br.readLine());

        switch (A) {
            case 1:
                System.out.println("Monday Понеділок Poniedziałek");
                break;

            case 2:
                System.out.println("Tuesday Вівторок Wtorek ");
                break;

            case 3:
                System.out.println("Wednesday Середа Środa ");
                break;

            case 4:
                System.out.println("Thursday Четвер Czwartek ");
                break;

            case 5:
                System.out.println("Friday П'ятниця Piątek ");
                break;

            case 6:
                System.out.println("Saturday Субота Sobota ");
                break;

            case 7:
                System.out.println("Sunday Неділя Niedziela");
                break;

                default:
                    System.out.println("Only from 1 to 7 !!!");
                    break;
        }
    }

}
