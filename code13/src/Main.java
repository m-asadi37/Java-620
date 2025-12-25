import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //immutable
        String str = "java php python php go js php C++";

        System.out.println(str.length());

        char c = str.charAt(5);
        System.out.println(c);

        System.out.println(str.indexOf('h'));
        System.out.println(str.indexOf("py"));
        System.out.println(str.lastIndexOf('p'));

        //string pool
        String a1 = "aa";
        String a2 = new String("aa");
        System.out.println(a1 == a2);
        System.out.println(a1 == a2.intern());

        System.out.println("aa".equals("aa"));

        System.out.println("ABC".equals("abc"));
        System.out.println("ABC".equalsIgnoreCase("abc"));

        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        arr = str.split("p");
        System.out.println(Arrays.toString(arr));

        String str2 = str.substring(5);
        System.out.println(str2);
        System.out.println(str.substring(5, 10));

        System.out.println("   aaaa  ss sd a dd  ".trim());

        System.out.println(str.replace('p', 'P'));
        System.out.println(str);
        System.out.println(str.replaceFirst("php", "rust"));
        System.out.println(str.replaceAll("php", "rust"));

        System.out.println(str.contains("java"));
        System.out.println(str.contains("JAVA"));
        System.out.println(str.toUpperCase().contains("JAVA"));
        System.out.println(str.startsWith("ja"));
        System.out.println(str.endsWith("c--"));

        System.out.println("".isEmpty());
        System.out.println("   ".isBlank());
        System.out.println(" ".isEmpty());

        //byte short int long
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        String s1 = String.join("-", "aa", "bb", "cc");
        System.out.println(s1);

        String.join("*", new String[]{"aa", "vv", "zz"});

        System.out.println(str.replace(" ",""));

        System.out.println("12345\n1233456\n123344421313\n123".indent(2));
    }

    public static void main1(String[] args) {
        int n = 12;
        String[] arr = new String[n];
        int result = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(i + 1);
            result += (i + 1);
        }
        String s1 = String.join(" + ", arr);
        s1 = s1 + " = " + result;
        System.out.println(s1);

        String s2 = String.format("name : %s , age : %d", "taha", 10);
        System.out.println(s2);

        int i = "a".compareTo("A");
        System.out.println(i);

        System.out.println("A".compareTo("A"));
        System.out.println("1404/01/01".compareTo("1401/09/01"));

        String s = "";
        for (int j = 0; j < 10; j++) {
            s = s + "*";
        }
        System.out.println(s);
        System.out.println("*".repeat(10));

    }
}
