
public class Main {

    public static void main(String[] args) {
        int a = 1;

        Person person1 = new Person();
        person1.name = "faranak";
        person1.family = "lorpoor";
        person1.age = 16;

        Person person2 = new Person();
        person2.name = "aida";
        person2.family = "rostami";
        person2.age = 17;

        String name = person1.name;
        System.out.println("person1 name is " + name);
        System.out.println("person2 name is " + person2.name);

    }

}
