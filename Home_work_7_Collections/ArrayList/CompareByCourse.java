package Home_work_7_Collections.ArrayList;

import java.util.Comparator;

public class CompareByCourse implements Comparator<Student> {

	@Override
	public int compare(Student st1, Student st2) {
		return st1.getCourse().compareTo(st2.getCourse());
	}

}
