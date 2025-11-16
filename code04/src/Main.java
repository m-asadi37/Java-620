public class Main {

    public static void main1(String[] args) {

        System.out.printf("name : %s, age : %d%n", "maedeh", 15);

        System.out.printf("number1 : %,15d%n", 12000);

        System.out.printf("number2 : %015d%n", 12000);

        System.out.printf("number3 : %-,20.3f%n", 120345610.34512345);

        System.out.printf("value1 : %-10S", "java");

    }

    public static void main(String[] args) {
        int aa = 7, bb = 5;
        int c = 12 - 14;
        System.out.println(aa + bb);
        System.out.println(12 - 14);

        System.out.printf("15 / 7 : %d%n", 15 / 7);
        System.out.printf("15 %% 7 : %d%n", 15 % 7);

        System.out.println("****");


        int i1 = 10;
        int i2 = i1++;
        //i2 = i1;
        //i1 = i1 + 1;
        System.out.println(i1);
        System.out.println(i2);

        i1 = 3;
        i2 = i1--;
        System.out.println(i1);
        System.out.println(i2);

        i1 = 10;
        i2 = ++i1;
        //i1 = i1 + 1;
        //i2 = i1;
        System.out.println(i1);
        System.out.println(i2);

        i1 = -5;
        i2 = --i1;
        System.out.println(i1);
        System.out.println(i2);

        System.out.println("****");

        int i3 = 10;
        i3 += 5;
        //i3 = i3 + 5
        System.out.println(i3);

        i3 -= 6;
        System.out.println(i3);

        //i3 = 9;
        //i3 = i3 % 3;
        i3 %= 3;
        System.out.println(i3);

        System.out.println("****");

        System.out.println(12 != 15);
        System.out.println(i1 > i2);

        boolean a = false;
        boolean b = false;
        boolean aANDb = a && b;
        System.out.println(aANDb);
        System.out.println(a || b);

        System.out.println(12 & 2);
    }
}
