package Home_work_7_Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Student {

	// Write class Student that provides information about the name of the student
	// and his course.
	// Class Student should consists of
	// properties for access to these fields
	// constructor with parameters
	// method printStudents (List students, Integer course),
	// which receives a list of students and the course number and prints to the
	// console the
	// names of the students from the list, which are taught in this course (use an
	// iterator)
	// methods to compare students by name and by course
	// In the main() method
	// declare List students and add to the list five different students
	// display the list of students ordered by name
	// display the list of students ordered by course.

	private String name;
	private Integer course;

	public Student() {
	}

	public Student(String name, Integer course) {
		this.name = name;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCourse() {
		return course;
	}

	public void setCourse(Integer course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student name = " + name + ", course = " + course;
	}

	public static List<Student> printStudents(List<Student> studentsList, Integer course) throws Exception {
		List<Student> temporaryList = new ArrayList<Student>();
		if (course > 0 && course < 5) {
			for (Student temporary : studentsList) {
				if (course.equals(temporary.getCourse())) {
					temporaryList.add(temporary);
				}
			}
		} else {
			throw new Exception("Entered course is invalid.");
		}
		return temporaryList;
	}

}
