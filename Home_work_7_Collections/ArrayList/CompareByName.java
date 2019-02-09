package Home_work_7_Collections.ArrayList;

import java.util.Comparator;

public class CompareByName implements Comparator<Student> {

	// public static List<Student> compareByName(List<Student> studentsList) {
	// List<Student> temporaryList = new ArrayList<Student>();
	// temporaryList.sort((Comparator<? super Student>) temporaryList);
	//
	// return studentsList;
	// }

	@Override
	public int compare(Student st1, Student st2) {
		return st1.getName().compareTo(st2.getName());
	}

}
