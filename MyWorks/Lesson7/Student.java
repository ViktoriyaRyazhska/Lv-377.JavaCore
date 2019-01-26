package Lesson7;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class Student {
	
		private String name;
		private int course;
		
		@Override
		public String toString() {
			return "Student [name=" + name + ", course=" + course + "]";
		}

		public Student(String name, int course) {
			this.name = name;
			this.course = course;
		}

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
		
		static NameComparator nameComparator = new NameComparator( );
		static CourseComparator courseComparator =new CourseComparator();

		
		public static NameComparator getNameComparator() {
			return nameComparator;
		}

		public static CourseComparator getCourseComparator() {
			return courseComparator;
		}
				
		static class NameComparator implements Comparator{

			@Override
			public int compare(Object o1, Object o2) {
				return ((Student)o1).getName().compareTo(((Student)o2).getName());
			}
			
		}
		
		static class CourseComparator implements Comparator {
			 public int compare(Object o1, Object o2) {
			 int x=((Student)o1).getCourse()-((Student)o2).getCourse();
			 return x ;
			  }
			}
		
	
		static void printStudents (Set<Student> student, Integer course){
			for (Student st : student) {
				if (st.getCourse() == course) {
					System.out.println(st);
				}
			}
		}
		

		
		
		
	

}

