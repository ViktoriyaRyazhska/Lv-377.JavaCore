package SoftServe.Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First {
    public static void main(String[] Args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 num");
        int A = Integer.parseInt(br.readLine());
        System.out.println("Enter 2 num");
        int B = Integer.parseInt(br.readLine());
        System.out.println("Enter 3 num");
        int C = Integer.parseInt(br.readLine());

        int odd = 0;
        if (A%2 != 0) {
            odd++;
        }
        if (B%2 != 0) {
            odd++;
        }
        if (C%2 != 0) {
            odd++;
        }
        System.out.println(odd+" digits odd 0");
    }
}
