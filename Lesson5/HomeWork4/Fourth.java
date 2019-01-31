package SoftServe.Lesson5.HomeWork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fourth {
    public static void main(String[] Args) { //Organize entering integers until the first negative number.
                                                                // Count the product of all entered even numbers.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = 0;
        Integer[] Numbers = new Integer[5];
        Integer[] tmp = null;
        int lastPosotion = 0;

        while (A >= 0) {
            for (int i = lastPosotion; i < Numbers.length; i++) {
                System.out.println("Enter the number "+(i + 1));
                try {
                    A = Integer.parseInt(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (NumberFormatException e) {
                    System.err.println("You have to enter a number");
                    e.printStackTrace();
                }
                if (A < 0) {
                    Numbers[i] = 0;
                    break;
                }
                Numbers[i] = A;
                lastPosotion = i;
            }
            lastPosotion++;
            if (A < 0) {
                break;
            }
            Numbers = Fourth.extendArray(Numbers, tmp);
        }
        Numbers = Fourth.cutArray(Numbers, tmp);
        System.out.println("Sum of entered numbers is "+Fourth.getSumOfArray(Numbers));
    }

    static Integer[] extendArray(Integer[] arr, Integer[] tmp) {
        tmp = new Integer[(arr.length * 2)];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        return tmp;
    }

    static Integer[] cutArray(Integer[] arr, Integer[] tmp) {
        int linkLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                linkLength = i;
                break;
            }
        }

        tmp = new Integer[linkLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = arr[i];
        }
        return tmp;
    }

    static int getSumOfArray(Integer[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
