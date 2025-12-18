
public class Main {

    public static void main1(String[] args) {
        //primitive
        int i1 = 10;
        double d1 = 10.0;
        boolean b1 = true;
//        i1 = null;

        //Boxing
        Integer int1 = i1;

        Integer int2 = Integer.valueOf("123");
        int1 = null;

        Double d2 = 12.13;
        double d3 = Double.parseDouble("12.12");
        //unboxing
        double d4 = d2;

        Boolean b2 = Boolean.TRUE;
        boolean b3 = true;
    }

    public static void main(String[] args){
        String s1 = "salam";

        System.out.println(s1);
        String s2 = s1.toUpperCase();
        System.out.println(s2);

        String s3 = "JAVA";
        System.out.println(s3.toLowerCase());

        System.out.println(s3.concat(" PYTHON"));

        System.out.println(" 01 ".repeat(5));

        String str1 = "12345";
        System.out.println(str1.length());

        String str0 = "";
        System.out.println(str0 == null);
        System.out.println(str1.isEmpty());

        str1 = "   ";
        System.out.println(str1 == null);
        System.out.println(str1.isEmpty());
        System.out.println(str1.isBlank());


    }

}
