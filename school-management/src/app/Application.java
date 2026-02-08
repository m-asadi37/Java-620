package app;

import java.util.Scanner;

public class Application {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        boolean isExit = false;
        while (!isExit) {
            int choice = printMenu();

            switch (choice) {
                case 1 -> {
                    int choice2 = printStudentMenu();
                    switch (choice2) {
                        case 1 -> {
                        }
                    }
                }
                case 0 -> isExit = true;

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
