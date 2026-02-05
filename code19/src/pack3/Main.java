package pack3;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("bahar", LocalDate.of(2002, 11, 12));
        person.info();

        person.setName("negar");
        person.setBirthDate(LocalDate.now());
        person.info();
    }
}
