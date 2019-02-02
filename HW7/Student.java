package HW7;

import java.util.Iterator;
import java.util.List;

public class Student {
	private Integer course;
	private String name;
	
	public Student () {
		
	}
	
	public Student (String name) {
		this.name = name;
	}
	
	public Student (String name, Integer course) {
		this.name = name;
		this.course = course;
	}
	
	public static void printStudents(List<Student> students, Integer course) {
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()){
			Student student = (Student) iterator.next();
			if (student.getCourse() == course) {
				System.out.println (student);
			}
		}
	}

	public Integer getCourse() {
		return course;
	}

	public void setCourse(Integer course) {
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [course=" + course + ", name=" + name + "]";
	}
	
}
