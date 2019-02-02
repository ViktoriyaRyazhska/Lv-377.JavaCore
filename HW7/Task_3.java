package HW7;

import java.util.ArrayList;
import java.util.List;

public class Task_3 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();

        list.add(new Student("Jo", 1));
        list.add(new Student("An", 2));
        list.add(new Student("Hu", 4));
        list.add(new Student("Ki", 2));
        list.add(new Student("An", 3));
        
        Student.printStudents(list, 2);
        System.out.println("");
        
        list.sort(new NameComparator());
        for (Student student : list) {
            System.out.println(student);
        }
        
        System.out.println("");
        
        list.sort(new CourseComparator());
        for (Student student : list) {
            System.out.println(student);
        }

	}
}