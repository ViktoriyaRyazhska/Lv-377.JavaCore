package SoftServe.Lesson7.HomeWork6.Third;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {

    private String name;
    private Integer course;
    private static CompareByName compareByName = new CompareByName();
    private static CompareByCourse compareByCourse = new CompareByCourse();

    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public Integer getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static void showStudents(List<Student> students) {
        for (Iterator<Student> i = students.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }
    }

    public static void printStudents(List<Student> students, Integer course) {

        for (Iterator<Student> i = students.iterator(); i.hasNext();) {
            Student A = i.next();
            if (A.getCourse().intValue() == course.intValue()) {
                System.out.println(A);
            }
        }
    }

    static class CompareByName implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    static class CompareByCourse implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getCourse() - o2.getCourse();
        }
    }




    public static Comparator compareStudentsName() {
        return compareByName;
    }

    public static Comparator compareStudentsCourse() {
        return compareByCourse;
    }

}
