package hw7.softserve;

import java.util.Comparator;

public class Student {
	
	private String name;
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
	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}
	@Override
	public String toString() {
		return "[Name: " + getName() + ", Course: " + getCourse() + "]";
	}
	static NameComparator nameComparator = new NameComparator( );
	static CourseComparator courseComparator =new CourseComparator();

	
	public static NameComparator getNameComparator() {
		return nameComparator;
	}

	public static CourseComparator getCourseComparator() {
		return courseComparator;
	}
			
	static class NameComparator implements Comparator<Object>{

		@Override
		public int compare(Object o1, Object o2) {
			return ((Student)o1).getName().compareTo(((Student)o2).getName());
		}
		
	}
	
	static class CourseComparator implements Comparator<Object> {
		 public int compare(Object o1, Object o2) {
		 int x=((Student)o1).getCourse()-((Student)o2).getCourse();
		 return x ;
		  }
}
	
	

}
