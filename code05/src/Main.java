import java.util.Scanner;

public class Main {

    public static void main1(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("number is negative");
            System.out.println("*****");
            System.out.println("*****");

        } else if (n < 100)
            System.out.println("number is smaller than 100");

        else {
            System.out.println("number is too large!");
        }

        String str = sc.next();
        switch (str) {
            case "JAVA":
                System.out.println("hello java!!");
                break;
            case "C++":
                System.out.println("hello C++");
            case "PYTHON":
                System.out.println("hello python!!");
            case null:
                System.out.println("string is null");
                break;
            default:
                System.out.println("default : string is " + str);
        }

        System.out.println("end..");
    }

    public static void main2(String[] args) {

        for (int i = 1; i < 10; i *= 2) {
            System.out.print("number is : ");
            System.out.println(i);
        }

        for (int i = 10; i > 0; i = i / 2)
            System.out.println(i);

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        while (input > 0) {
            System.out.println("enter the menu (0 for exit) : ");
            input = sc.nextInt();
        }

        System.out.println("****");

        do {
            System.out.println("do block ...");
            System.out.println("enter the number : ");
            input = sc.nextInt();
        } while (input > 0);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i % 5 == 0)
                continue;
            if (i % 12 == 0)
                break;
            System.out.printf("i : %d%n", i);
        }




        System.out.println("end of program!!!");
    }
}
