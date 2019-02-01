import java.util.Comparator;
import java.util.List;

public class Students {

	private String name;
	private int course;
	private static NameComparator nameComp = new NameComparator();
	private static CourseComparator courseComp = new CourseComparator();

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

	public Students(String name, int course) {
		this.name = name;
		this.course = course;
	}
	public static Comparator<Students> getNameComparator(){
		return nameComp;
	}
	public static Comparator<Students> getCourseComparator(){
		return courseComp;
	}

	@Override
	public String toString() {
		return "Student [name= " + name + ", course= " + course + "]";
	}

	public static void show(List<Students> st) {
		for (Object obj : st) {
			System.out.println(obj);
		}
	}

	public static void stringStudent(List<String> students, int course) {

	}

	static class NameComparator implements Comparator<Students> {

		@Override
		public int compare(Students o1, Students o2) {
			return o1.getName().compareTo(o2.getName());
		}


		}
	static class CourseComparator implements Comparator {
		@Override
		public int compare(Object o1, Object o2) {
			return ((Students)o1).getCourse() - ((Students)o2).getCourse();
		}

	}

}
