package serice;

import entity.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StudentService {
    private Student[] repository = new Student[10];
    private Scanner INPUT = new Scanner(System.in);

    public void deleteStudent() {
        System.out.print("id: ");
        int id = INPUT.nextInt();
        for (int i = 0; i < repository.length; i++) {
            if (repository[i] != null && repository[i].getId() == id) {
                repository[i] = null;
                System.out.println(">> student " + id + " has been deleted!");
                return;
            }
        }
        System.out.println(">> student not found!");
    }

    public void listStudents() {
        for (Student find : repository) {
            if (find != null) {
                find.showInfo();
            }
        }
    }

    public void infoStudent() {
        System.out.print("id: ");
        int id = INPUT.nextInt();
        boolean flag = false;
        for (Student find : repository) {
            if (find != null && find.getId() == id) {
                find.showInfo();
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(">> student not found!");
    }

    public void updateStudent() {
        System.out.print("id for update: ");
        int id = INPUT.nextInt();
        System.out.print("new grade: ");
        double grade = INPUT.nextDouble();
        for (Student student : repository) {
            if (student != null && student.getId() == id) {
                student.setGrade(grade);
                System.out.println(">> student updated!");
                return;
            }
        }
        System.out.println(">> student not found!");
    }

    public void addStudent() {
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
        for (int i = 0; i < repository.length; i++) {
            if (repository[i] == null) {
                repository[i] = student;
                System.out.println(">> student created!");
                break;
            }
        }
    }
}
