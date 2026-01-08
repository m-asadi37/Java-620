package string;

import java.lang.StringBuffer;

public class Main {

    public static void main1(String[] args) {
        String input = "ali.ali@gmail.com";
        boolean b1 = "$".matches("[a-zA-Z0-9]");
        System.out.println(b1);

        System.out.println(input.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"));

        //1.operator +
        String s1 = "java" + " " + "script";
        System.out.println(s1);

        //2.concat
        String s2 = "java";
        System.out.println(s2.concat(" ").concat("script"));
        System.out.println(s2);

        //mutable
        //3.String builder
        //4.String buffer
        StringBuilder s3 = new StringBuilder("java");
        s3.append(" ").append("script");
        System.out.println(s3);
        s3.append(1).append(true);
        System.out.println(s3);

        StringBuffer sb2 =  new StringBuffer("java");
        sb2.append(" ").append("script");
        System.out.println(sb2);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String s1 = "";
        for (int i = 0; i < 100000; i++) {
            s1 = s1 + "*";
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);


        start = System.currentTimeMillis();
        s1 = "";
        for (int i = 0; i < 100000; i++) {
            s1 = s1.concat("*");
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            sb1.append("*");
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb2.append("*");
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
