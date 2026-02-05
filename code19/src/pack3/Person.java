package pack3;

import java.time.LocalDate;

public class Person {

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Person() {
    }

    //ENCAPSULATION
    //1. private access for fields
    private String name;
    private LocalDate birthDate;

    //2. GETTER AND SETTER for each property
    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    public void info() {
        System.out.println("Name : " + name);
        System.out.println("Birth Date : " + birthDate);
        System.out.println("Age : " + calculateAge());
    }

    private int calculateAge(){
        return LocalDate.now().minusYears(birthDate.getYear()).getYear();
    }
}
