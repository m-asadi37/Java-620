package serice;

import entity.Teacher;

import java.util.Scanner;

public class TeacherService {
    private Scanner INPUT = new Scanner(System.in);
    private Teacher[] repository = new Teacher[10];

    public void deleteTeacher() {
        System.out.print("id: ");
        int id = INPUT.nextInt();

        for (int i = 0; i < repository.length; i++) {
            if (repository[i] != null && repository[i].getId() == id) {
                repository[i] = null;
                System.out.println(">> Teacher Deleted!");
                return;
            }
        }
        System.out.println(">> Teacher Not Found With Id=" + id);
    }

    public void listTeacher() {
        for (Teacher find : repository) {
            if (find != null) {
                find.showInfo();
            }
        }
    }

    public void infoTeacher() {
        System.out.print("id: ");
        int id = INPUT.nextInt();
        for (Teacher find : repository) {
            if (find != null && find.getId() == id) {
                find.showInfo();
                return;
            }
        }
        System.out.println(">> Teacher Not Found With Id=" + id);
    }

    public void updateTeacher() {
        System.out.print("id for update: ");
        int id = INPUT.nextInt();
        for (Teacher find : repository) {
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

    public void addTeacher() {
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
        for (int i = 0; i < repository.length; i++) {
            if (repository[i] == null) {
                repository[i] = teacher;
                System.out.println(">> Teacher Added Successfully!");
                break;
            }
        }
    }
}
