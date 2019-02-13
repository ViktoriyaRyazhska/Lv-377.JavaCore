package practivaltasks;

public class Task13 {

	public static int toDivide() {
        boolean notNeededNumber = true;
        int numberSet = 20;
        int current = numberSet;
        while (notNeededNumber) {
            for (int i = numberSet; i > 10; i--) {
                if (current % i != 0) {
                    current = current + numberSet;
                    notNeededNumber = true;
                    break;
                } else {
                    notNeededNumber = false;
                }
            }
        }
        return current;
    }

//    public static void main(String[] args) {

        // 13.	2520 is the smallest number that can be divided by
        // each of the numbers from 1 to 10 without any remainder.
        // What is the smallest positive number that is evenly divisible
        // by all of the numbers from 1 to 20?
        
//        System.out.println(toDivide());
//    }
}
