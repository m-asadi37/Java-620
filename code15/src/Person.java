public class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void info(){
        System.out.print("name: " + name);
        System.out.println(" age: " + age);
    }
}