package app;

import entity.Student;
import entity.Teacher;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Application {
    private static Scanner INPUT = new Scanner(System.in);
    private static Student[] STUDENTS = new Student[10];
    private static Teacher[] TEACHERS = new Teacher[10];

    public static void main(String[] args) {

        INPUT.useDelimiter("\n");
//        List<Student>  studentList = new ArrayList<>();

        boolean isExit = false;
        while (!isExit) {
            int menu = printMenu();

            switch (menu) {
                case 1 -> {
                    boolean isBack = false;
                    while (!isBack) {
                        int submenu = printStudentMenu();
                        switch (submenu) {
                            case 1 -> addStudent();
                            case 2 -> updateStudent();
                            case 3 -> infoStudent();
                            case 4 -> listStudents();
                            case 5 -> deleteStudent();
                            case 0 -> isBack = true;
                            default -> System.out.println(">> Invalid Command!");
                        }
                    }
                }
                case 2 -> {
                    boolean isBack = false;
                    do {
                        int submenu = printTeacherMenu();
                        switch (submenu) {
                            case 1 -> addTeacher();
                            case 2 -> updateTeacher();
                            case 3 -> infoTeacher();
                            case 4 -> listTeacher();
                            case 5 -> deleteTeacher();
                            case 0 -> isBack = true;
                            default -> System.out.println(">> Invalid Command!");
                        }
                    } while (!isBack);
                }
                case 0 -> isExit = true;
                default -> System.out.println(">> Invalid Command!");
            }
        }
    }

    private static void deleteTeacher() {
        System.out.print("id: ");
        int id = INPUT.nextInt();

        for (int i = 0; i < TEACHERS.length; i++) {
            if (TEACHERS[i] != null && TEACHERS[i].getId() == id) {
                TEACHERS[i] = null;
                System.out.println(">> Teacher Deleted!");
                return;
            }
        }
        System.out.println(">> Teacher Not Found With Id=" + id);
    }

    private static void listTeacher() {
        for (Teacher find : TEACHERS) {
            if (find != null) {
                find.showInfo();
            }
        }
    }

    private static void infoTeacher() {
        System.out.print("id: ");
        int id = INPUT.nextInt();
        for (Teacher find : TEACHERS) {
            if (find != null && find.getId() == id) {
                find.showInfo();
                return;
            }
        }
        System.out.println(">> Teacher Not Found With Id=" + id);
    }

    private static void updateTeacher() {
        System.out.print("id for update: ");
        int id = INPUT.nextInt();
        for (Teacher find : TEACHERS) {
            if (find != null && find.getId() == id) {
                System.out.print("new salary: ");
                double salary = INPUT.nextDouble();

                find.setSalary(salary);
                System.out.println(">> Salary Updated!");
                return;
            }
        }
        System.out.println(">> Teacher Not Found With Id=" + id);
    }

    private static void addTeacher() {
        System.out.print("id: ");
        int id = INPUT.nextInt();
        System.out.print("name: ");
        String name = INPUT.next();
        System.out.print("family: ");
        String family = INPUT.next();
        System.out.print("major: ");
        String major = INPUT.next();
        System.out.print("salary: ");
        double salary = INPUT.nextDouble();

        Teacher teacher = new Teacher(id, name, family, major, salary);
        for (int i = 0; i < TEACHERS.length; i++) {
            if (TEACHERS[i] == null) {
                TEACHERS[i] = teacher;
                System.out.println(">> Teacher Added Successfully!");
                break;
            }
        }
    }

    private static int printTeacherMenu() {
        System.out.println("*** TEACHERS ***");
        System.out.println("1. add");
        System.out.println("2. update salary");
        System.out.println("3. info");
        System.out.println("4. list");
        System.out.println("5. delete");
        System.out.println("0. BACK");
        return INPUT.nextInt();
    }

    private static void deleteStudent() {
        System.out.print("id: ");
        int id = INPUT.nextInt();
        for (int i = 0; i < STUDENTS.length; i++) {
            if (STUDENTS[i] != null && STUDENTS[i].getId() == id) {
                STUDENTS[i] = null;
                System.out.println(">> student " + id + " has been deleted!");
                return;
            }
        }
        System.out.println(">> student not found!");
    }

    private static void listStudents() {
        for (Student find : STUDENTS) {
            if (find != null) {
                find.showInfo();
            }
        }
    }

    private static void infoStudent() {
        System.out.print("id: ");
        int id = INPUT.nextInt();
        boolean flag = false;
        for (Student find : STUDENTS) {
            if (find != null && find.getId() == id) {
                find.showInfo();
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(">> student not found!");
    }

    private static void updateStudent() {
        System.out.print("id for update: ");
        int id = INPUT.nextInt();
        System.out.print("new grade: ");
        double grade = INPUT.nextDouble();
        for (Student student : STUDENTS) {
            if (student != null && student.getId() == id) {
                student.setGrade(grade);
                System.out.println(">> student updated!");
                return;
            }
        }
        System.out.println(">> student not found!");
    }

    private static void addStudent() {
        System.out.print("id: ");
        int id = INPUT.nextInt();
        System.out.print("name: ");
        String name = INPUT.next();
        System.out.print("family: ");
        String family = INPUT.next();
        System.out.print("major: ");
        String major = INPUT.next();
        System.out.print("birthdate: ");
        String birthdateStr = INPUT.next();
        LocalDate birthdate = LocalDate.parse(birthdateStr, DateTimeFormatter.ISO_DATE);
        Student student = new Student(id, name, family, birthdate, major);
        for (int i = 0; i < STUDENTS.length; i++) {
            if (STUDENTS[i] == null) {
                STUDENTS[i] = student;
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
        System.out.println("--- 0. BACK     ---");
        return INPUT.nextInt();
    }

    private static int printMenu() {
        System.out.println("*** SCHOOL MANAGEMENT ***");
        System.out.println("--- 1. STUDENT  ---");
        System.out.println("--- 2. TEACHER  ---");
        System.out.println("--- 3. COURSE   ---");
        System.out.println("--- 0. EXIT     ---");
        return INPUT.nextInt();
    }
}
