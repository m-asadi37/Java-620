package app;

import entity.Student;
import entity.Teacher;
import serice.StudentService;
import serice.TeacherService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Application {
    private static Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        TeacherService teacherService = new TeacherService();
        StudentService studentService = new StudentService();

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
                            case 1 -> studentService.addStudent();
                            case 2 -> studentService.updateStudent();
                            case 3 -> studentService.infoStudent();
                            case 4 -> studentService.listStudents();
                            case 5 -> studentService.deleteStudent();
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
                            case 1 -> teacherService.addTeacher();
                            case 2 -> teacherService.updateTeacher();
                            case 3 -> teacherService.infoTeacher();
                            case 4 -> teacherService.listTeacher();
                            case 5 -> teacherService.deleteTeacher();
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
