package CollectionsGeneric;

import java.util.ArrayList;
import java.util.Iterator;

public class Task5Students {
	private String name = new String();
	private int course;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}

	public Task5Students(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public static void printStudentTheSameCourse(ArrayList<Task5Students> students, int course) {
		Iterator<Task5Students> studentsIter = students.iterator();
		while (studentsIter.hasNext()) {
			Task5Students student = (Task5Students) studentsIter.next();
			if (student.getCourse() == course) {
				System.out.println("Course: "+student.getCourse()+"; Name: "+student.getName());
			}
		}
	}
	
	public static void printAll(ArrayList<Task5Students> students) {
		Iterator<Task5Students> studentsIter = students.iterator();
		while (studentsIter.hasNext()) {
			Task5Students student = (Task5Students) studentsIter.next();
				System.out.println("Course: "+ student.getCourse()+ "; Name: "+student.getName());
		}
	}
}

