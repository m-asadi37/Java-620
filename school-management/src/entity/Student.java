package entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {

    private int id;
    private String name;
    private String family;
    private double grade;
    private LocalDate birthdate;
    private String major;

    public Student(int id, String name, String family, LocalDate birthdate, String major) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.birthdate = birthdate;
        this.major = major;
        this.grade = 0.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void showInfo() {
        System.out.printf("[id:'%d', name: '%s', family: '%s', birthdate: '%s',  major: '%s',  grade: '%.2f']\n",
                id, name, family, birthdate.format(DateTimeFormatter.ISO_DATE), major, grade);
    }
}
