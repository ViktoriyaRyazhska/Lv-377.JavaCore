package SoftServe.First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstProg {
    public static void main(String[] Args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a");
        int a = 0;
        try {
            a = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        //a = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        System.out.println("Enter b");
        int b = 0;
        try {
            b = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        //b = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

        System.out.println(a+"+"+b+" = "+(a+b));
        System.out.println(a+"-"+b+" = "+(a-b));
        System.out.println(a+"*"+b+" = "+(a*b));
        System.out.println(a+"/"+b+" = "+(a/b));

        System.out.println("How are you?");
        String st = null;
        try {
            st = new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("You are "+st);
    }
}
