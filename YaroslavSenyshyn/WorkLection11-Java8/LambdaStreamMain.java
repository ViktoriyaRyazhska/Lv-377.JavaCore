package LambdaStream;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LambdaStreamMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input n");
		int quantity = sc.nextInt();
		
////// task1 
		Random random = new Random();
		random.ints().limit(quantity).forEach(System.out::println);
		
////// task2
		System.out.println();
		random.ints().limit(quantity).sorted().forEach(System.out::println);
		
////// task3 
		System.out.println();
		int max = random.ints().limit(quantity).max().getAsInt();
		System.out.println(max);
		System.out.println();

////// task4
		DayOfWeek dayOfWeek = LocalDateTime.now().getDayOfWeek();
		System.out.println(dayOfWeek);

////// task5
		LocalDate ld = LocalDate.now();
		LocalDate firstMonday = ld.with(DayOfWeek.MONDAY);
		System.out.println("First Monday: " + firstMonday);
		
////// task6
		List<Integer> listInt = Arrays.asList(36, 29, 31, 4, 5);
		
		listInt.sort(Comparator.naturalOrder());
		System.out.println(listInt);
	}

}
