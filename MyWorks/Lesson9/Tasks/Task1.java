package Lesson9;

import java.util.InputMismatchException;

public class Task1 {

	public static void main(String[] args) {
		int a=5, b=-3;
			if((a>0)&&(b>0)) {
				int result=a*b;
				System.out.println(result);
			
				} else throw new InputMismatchException("Square can not be negative!");
		}
}

// Create a method for calculating the area of a rectangle
// int squareRectangle (int a, int b),
// which should throw an exception if the user enters negative value.
// Input values a and b from console.
// Check the squareRectangle method in the method main.
// Check to input nonnumeric value.
