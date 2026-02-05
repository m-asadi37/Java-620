package pack1;

public class Test {

    public int pub;
    protected int prot;
    int def;
    private int prvt;


    public void info() {
        System.out.println("public : " + pub);
        System.out.println("protected : " + prot);
        System.out.println("default : " + def);
        System.out.println("private : " + prvt);
    }
}
