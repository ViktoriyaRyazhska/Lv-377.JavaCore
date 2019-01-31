package SoftServe.Lesson9.HomeWork8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Second {
    public static void main(String[] Args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 1;
        int b = 10;
        while (b <= 100) {
            System.out.println("Enter a number in range ["+a+" - "+b+"]");
            try {
                System.out.println(readNumber(a, b, br));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (OutOfRange outOfRange) {
                outOfRange.printStackTrace();
            }
            a *= 4;
            b *= 2;
        }
        System.out.println("Normal exit from program ");
    }

    static int readNumber(int start, int end, BufferedReader br) throws IOException, NumberFormatException, OutOfRange {
        int A;
        A = Integer.parseInt(br.readLine());
        if (start <= A && A <= end) {
            return A;
        } else {
            throw new OutOfRange("Out of range ");
        }
    }

    static class OutOfRange extends Exception {
        public OutOfRange(String message) {
            super(message);
        }
    }
}
