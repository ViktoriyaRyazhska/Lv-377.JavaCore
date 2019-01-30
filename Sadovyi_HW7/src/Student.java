//import java.util.Comparator;

public class Student {
	private   String name;
	private  int course;
	
	//static NameComparator nameComparator = 
		//	new NameComparator( );

	
	//public static NameComparator getNameComparator() {
		//return nameComparator;
	//}
//	public static void setNameComparator(NameComparator nameComparator) {
	//	Student.nameComparator = nameComparator;
//	}
	Student() {
		
	}
	Student(String name, int course) {
		this.name=name;
		this.course=course;
	}
	Student(String name) {
		this.name=name;
		
	}
	Student(int course) {
		this.course=course;
	}
	
	
	
	//void printStud(){
	//	System.out.println(name+"	"+course);
		
		
	//}
	
	
	
	public  String getName() {
		return name;
	}
	public  int getCourse() {
		return course;
	}
	public  void setName(String name) {
		this.name = name;
	}
	public  void setCourse(int course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}
	
	//static class NameComparator implements Comparator {
		 // public int compare(Object o1, Object o2) {
		  // return ((Student)o1).getName().compareTo(((Student)o2).getName());
		//  }
	//	}

	
}
