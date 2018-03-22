package com.company.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonHeightComparable {

    static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        students.add(new Student("Daniel", "H", 180));
        students.add(new Student("Marry", "B", 179));
        students.add(new Student("Suzy", "C", 169));
        students.add(new Student("George", "A", 190));
        students.add(new Student("Simon", "G", 210));
        students.add(new Student("Simon", "G", 211));

        Collections.sort(students);
        for (Student student : students) {
            System.out.println(String.format("%s %s : %s",
                    student.getFirstName(),
                    student.getLastName(),
                    student.getHeight()));
        }
    }
}


class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private Integer height;

    @Override
    public int compareTo(Student o) {
        return o.getHeight() - this.getHeight();
    }

    public Student(String firstName, String lastName, Integer height) {
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
