package Lesson7;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class StudentApplHw3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Set<Student> student =new TreeSet(Student.getNameComparator());
		student.add(new Student("Bruce",8));
		student.add(new Student("Skylar",2));
		student.add(new Student("Bob",7));
		student.add(new Student("Hector",2));
		student.add(new Student("Alan",9));
		System.out.println("Sorted by name:");
		System.out.println(student);
		System.out.println();
		Set<Student> student1 = new TreeSet(Student.getCourseComparator());
		student1.addAll(student);
		System.out.println("Sorted by course");
		System.out.println(student1);
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Show student name for the entered course number: ");
		System.out.println("Enter the number of the course: ");
		int course = Integer.parseInt(br.readLine());
		
		for (Student st : student) {
			if (st.getCourse() == course) {
				System.out.println(st);
			}
			
		}


	}

}

//Write class Student that provides information about the name of the student 
//and his course. Class Student should consists of
//properties for access to these fields
//constructor with parameters
//method printStudents (List students, Integer course), which receives a list of students 
//and the course number and prints to the console the names of the students from the list, 
//which are taught in this course (use an iterator)
//methods to compare students by name and by course
//In the main() method 
//declare List students and add to the list five different students
//display the list of students ordered by name
//display the list of students ordered by course.
