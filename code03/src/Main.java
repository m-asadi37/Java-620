import java.util.Scanner;

public class Main {

    public static void main1(String[] args) {
        // boolean 1 bit - 0/1 - true/false
        boolean b1 = false;
        b1 = 2 > 3;

        // char - 2 byte
        char c1 = 'x';
        c1 = '\u0041';
        System.out.println(c1);

        //String
        String str1 = "   qqw qw 121 !!!";
        str1 = "hello\njava";
        System.out.println(str1);

        str1 = "salam\tchetori?";
        System.out.println(str1);

        str1 = "char is : \"";
        System.out.println(str1);

        str1 = """
                hello java
                php
                python
                char is : '"'
                """;
        System.out.println(str1);


        //primitive
        //1. value only
        //2. not null -> 0 0.0 \u0000
        //byte short int long float double char boolean

        //non-primitive
        //1. value - method and details
        //2. can be null
        //String
    }

    public static void main2(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input1 = scan.nextInt();
        scan.nextLine();

        String str1 = scan.nextLine();

        System.out.println(input1);
        System.out.println(str1);

        /*scan.useDelimiter("\n");

        int i2 = scan.nextInt();
        String s2 = scan.next();

        System.out.println(i2);
        System.out.println(s2);*/

        scan.close();
    }

    public static void main(String[] args) {
        boolean b1 = false;

        System.out.println(b1);
        System.out.println("java");

        System.out.print(123);
        System.out.print("aaa");
        System.out.println(456);

        System.err.println("Error 404!!");
    }
}
