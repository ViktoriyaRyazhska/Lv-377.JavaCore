package SoftServe.Lesson7.HomeWork6.Third;

import java.util.ArrayList;
import java.util.List;

public class StudentDriver {
    public static void main(String[] Args) {
        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Ivan", 1));
        students.add(new Student("Vasay", 2));
        students.add(new Student("Andriy", 1));
        students.add(new Student("Roman", 2));

        students.sort(Student.compareStudentsName());
        Student.showStudents(students);
        students.sort(Student.compareStudentsCourse());
        Student.showStudents(students);
    }
}
