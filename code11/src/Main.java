public class Main {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "John";
        p1.family = "Doe";
        p1.age = 25;
        p1.info();

        Person p2 = new Person("James", "Gro");
        p2.info();

        Person p3 = new Person(20);
        p3.info();

        Car c1 = new Car();
        c1.colour = "RED";
        c1.year = 2010;
        c1.move();

        Car c2 = new Car("BLUE", 2019);
        c2.move();
    }
}
