public class Person {

    //constructor
    Person() {
        System.out.println("Person constructor 1 call...");
    }

    Person(String personName, String personFamily) {
        System.out.println("Person constructor 2 call...");
        name = personName;
        family = personFamily;
    }

    Person(int age) {
        System.out.println("Person constructor 3 call...");
//        age = age;// 2 == 2
        //this -> object in creation
        this.age = age;
    }

    String name;
    String family;
    int age;

    void info() {
        System.out.printf("Name: %s%n", name);
        System.out.printf("Family: %s%n", family);
        System.out.printf("Age: %d%n", age);
    }
}
