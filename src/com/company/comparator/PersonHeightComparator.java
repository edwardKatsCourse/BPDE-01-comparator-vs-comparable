package com.company.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonHeightComparator {

    static List<Student_2> students = new ArrayList<>();


    public static void main(String[] args) {
        students.add(new Student_2("Daniel", "H", 180));
        students.add(new Student_2("Marry", "B", 179));
        students.add(new Student_2("Suzy", "C", 169));
        students.add(new Student_2("George", "A", 190));
        students.add(new Student_2("Simon", "G", 210));
        students.add(new Student_2("Simon", "G", 211));

        Collections.sort(students, new StudentHeightComparator());
        for (Student_2 student : students) {
            System.out.println(String.format("%s %s : %s",
                    student.getFirstName(),
                    student.getLastName(),
                    student.getHeight()));
        }
    }
}

class StudentHeightComparator implements Comparator<Student_2> {

    @Override
    public int compare(Student_2 o1, Student_2 o2) {
        return o2.getHeight() - o1.getHeight();
    }
}

class Student_2 {
    private String firstName;
    private String lastName;
    private Integer height;

    public Student_2(String firstName, String lastName, Integer height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
