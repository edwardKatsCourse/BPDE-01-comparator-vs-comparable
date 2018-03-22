package com.company.random;

import java.util.*;

public class StudentApplication {

    static List<Student> students = new ArrayList<>();
    static List<String> names = Arrays.asList(
            "SARAH", "JAMIE", "JIM", "ANDREW", "SUSAN",
            "NATALIE", "DANIEL", "ANNA", "STEFAN", "PETER",
            "IVAN", "ANTONY", "EVGENY", "SERGEY", "PAUL");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            Student student = new Student(getRandomName(), getRandomPoint(), getRandomHeight());
            students.add(student);
            System.out.println(String.format("Added a new student: %s | %s", student.getName(), student.getPoint()));
            System.out.println("Added a new student: " + student.getName() + " | " + student.getPoint());
            Collections.sort(students);
            String createAnother = scanner.nextLine();
            if (createAnother.equalsIgnoreCase("no")) {
                printStudents();
                break;
            }

            printStudents();
        }
    }

    private static String getRandomName() {
        Random random = new Random();
        int randomIndex = random.nextInt(names.size());
        return names.get(randomIndex);
    }

    private static Integer getRandomHeight() {
        Random random = new Random();
        return random.nextInt(50) + 150;
    }

    private static Integer getRandomPoint() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    private static void printStudents() {
        for (Student student : students) {
            System.out.println(String.format("%s | %s | %s", student.getName(), student.getPoint(), student.getHeight()));
        }
        System.out.println("**********");
    }
}
