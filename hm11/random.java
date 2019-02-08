package lesson11;


import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Random;


public class random {
	public static void main(String[] args) {
		Random r = new Random();
 r.ints(1,50).limit(10).sorted().forEach(System.out::println);
 // i dont know how find max number;
 //pls help)))
 LocalDateTime a = LocalDateTime.now();
DayOfWeek d = a.getDayOfWeek();
LocalDateTime t = a.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
 System.out.println(d);
 System.out.println(t);
 //Write a method for sorting list of Strings using Java 8???
 //help
	}
}
