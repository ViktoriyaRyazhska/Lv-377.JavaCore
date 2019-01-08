package SoftServe.First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstProg {
    public static void main(String[] Args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a");
        int a = Integer.parseInt(br.readLine());
        //a = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        System.out.println("Enter b");
        int b = Integer.parseInt(br.readLine());
        //b = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());;

        System.out.println(a+"+"+b+" = "+(a+b));
        System.out.println(a+"-"+b+" = "+(a-b));
        System.out.println(a+"*"+b+" = "+(a*b));
        System.out.println(a+"/"+b+" = "+(a/b));

        System.out.println("How are you?");
        String st =new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println("You are "+st);
    }
}
