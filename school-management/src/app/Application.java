package app;

import entity.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    private static Scanner input = new Scanner(System.in);
    private static Student[] students = new Student[10];

    public static void main(String[] args) {

        input.useDelimiter("\n");
//        List<Student>  studentList = new ArrayList<>();

        boolean isExit = false;
        while (!isExit) {
            int choice = printMenu();

            switch (choice) {
                case 1 -> {
                    int choice2 = printStudentMenu();
                    switch (choice2) {
                        case 1 -> addStudent();
                        case 2 -> updateStudent();
                    }
                }
                case 0 -> isExit = true;

            }
        }
    }

    private static void updateStudent() {
        System.out.print("id for update: ");
        int id = input.nextInt();
        System.out.print("new grade: ");
        double grade = input.nextDouble();
        for (Student student : students) {
            if (student != null && student.getId() == id) {
                student.setGrade(grade);
                System.out.println(">> student updated!");
                break;
            }
        }
    }

    private static void addStudent() {
        System.out.print("id: ");
        int id = input.nextInt();
        System.out.print("name: ");
        String name = input.next();
        System.out.print("family: ");
        String family = input.next();
        System.out.print("major: ");
        String major = input.next();
        System.out.print("birthdate: ");
        String birthdateStr = input.next();
        LocalDate birthdate = LocalDate.parse(birthdateStr, DateTimeFormatter.ISO_DATE);
        Student student = new Student(id, name, family, birthdate, major);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                System.out.println(">> student created!");
                break;
            }
        }
    }

    private static int printStudentMenu() {
        System.out.println("*** STUDENTS ***");
        System.out.println("--- 1. add      ---");
        System.out.println("--- 2. update   ---");
        System.out.println("--- 3. info     ---");
        System.out.println("--- 4. list     ---");
        System.out.println("--- 5. delete   ---");
        System.out.println("--- 0. EXIT     ---");
        return input.nextInt();
    }

    private static int printMenu() {
        System.out.println("*** SCHOOL MANAGEMENT ***");
        System.out.println("--- 1. STUDENT  ---");
        System.out.println("--- 2. TEACHER  ---");
        System.out.println("--- 3. COURSE   ---");
        System.out.println("--- 0. EXIT     ---");
        return input.nextInt();
    }
}
