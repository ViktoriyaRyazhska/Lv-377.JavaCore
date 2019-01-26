import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {

	private String name;
	private int course;

	// ----------------------------------Constructors----------------------------------

	public Student() {
		this.setName("noname");
		this.setCourse(0);
	}

	public Student(String name) {
		this.setName(name);
		this.setCourse(0);
	}

	public Student(String name, int course) {
		this.setName(name);
		this.setCourse(course);
	}

	// ----------------------------------GettersSetters----------------------------------

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

	// ----------------------------------Methods----------------------------------

	public static String printStudentsByCourse(List<Student> students, int course) {
		String str = course + "th year students: ";
		for (Iterator<Student> it = students.iterator(); it.hasNext();) {
			Student student = it.next();
			if (student.course == course) {
				str += "[" + student.getName() + "] ";
			}
		}
		if (str == course + "th year students: ") {
			return "There are no such students";
		} else {
			return str;
		}
	}
	
	@Override
	public String toString() {
		return this.getName() + " " + this.getCourse();
	}
	
	static class NameCompare implements Comparator<Student>{

		@Override
		public int compare(Student s1, Student s2) {
			return s1.getName().compareTo(s2.getName());
		}
	}
	
	static class CourseCompare implements Comparator<Student>{

		@Override
		public int compare(Student s1, Student s2) {
			return s1.getCourse() - s2.getCourse();
		}
	}
	
	

	// ----------------------------------Main----------------------------------	

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Kostia", 1));
		students.add(new Student("Alisa", 3));
		students.add(new Student("Maria", 2));
		students.add(new Student("Pedro", 3));
		students.add(new Student("Oleg", 5));
		System.out.println(students);
		
		//Printing students by course
		System.out.println(printStudentsByCourse(students, 3));
		
		
		//Ordering by name
		NameCompare nameCompare = new NameCompare(); 
		Collections.sort(students, nameCompare);
		System.out.println(students);

		//Ordering by course
		CourseCompare courseCompare = new CourseCompare();
		Collections.sort(students, courseCompare);
		System.out.println(students);
		
		
	}

}
