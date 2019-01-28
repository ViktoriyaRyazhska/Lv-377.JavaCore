package com.company;

import java.util.Comparator;

public class kursComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getKurs() - o2.getKurs();
    }
}
