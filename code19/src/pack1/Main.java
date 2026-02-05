package pack1;

public class Main {

    public static void main(String[] args) {
        Test test = new Test();
        test.pub = 10;
        test.prot = 20;
        test.def = 30;
//        test.prvt = 40;
        test.info();
    }
}
