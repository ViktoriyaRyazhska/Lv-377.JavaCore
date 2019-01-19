package SoftServe.Lesson5;

public class First {
    public static void main(String[] Args) {
        int[] arr = {5, 9, 8, 4, 1, 3, -2, 6, 7, 0, 6, 4, 44};

        int L = arr.length;
        int max = arr[0];
        int sum = 0;
        int amountNegative = 0;
        int amountPositive = 0;
        for (int i = 0; i < L; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < L; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }

        for (int i = 0; i < L; i++) {
            if (arr[i] < 0) {
                amountNegative++;
            } else {
                amountPositive++;
            }
        }

        System.out.println("Max number is "+max+" sum of positive numbers is "+sum);
        System.out.println("Amount of negetive "+amountNegative+" amoung of positive "+amountPositive);
        System.out.println("There are more "+(amountPositive > amountNegative? "positive" : "negative")+" elements");
    }
}
