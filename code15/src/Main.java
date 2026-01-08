public class Main {

    public static void main(String[] args) {
        //call by value
        System.out.println("**** primitive parameters ****");
        int a = 10;
        System.out.println("value before call : " + a);//log
        changeInt(a);
        System.out.println("value after call : " + a);

        //call by value
        System.out.println("**** non-primitive parameters ****");
        String str = "java";
        System.out.println("value before call : " + str);
        changeString(str);
        System.out.println("value after call : " + str);

        System.out.println("**** class reference parameters ****");
        Person p1 = new Person("javad", 20);
        System.out.println("before call : ");
        p1.info();
        changePerson(p1);
        System.out.println("after call : ");
        p1.info();

    }

    private static void changePerson(Person person) {
        person.name = "bahar";
        person.age += 1;
        System.out.println("change in method :");
        person.info();
    }

    private static void changeString(String str) {
        str = str.toUpperCase();
        System.out.println("change in method : " + str);
    }

    private static void changeInt(int number) {
        number *= 2;
        System.out.println("in method : " + number);
    }
}
