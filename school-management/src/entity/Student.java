package entity;

import java.time.LocalDate;

public class Student {

    private String name;
    private String family;
    private double grade;
    private LocalDate birthdate;
    private String major;

    public Student(String name, String family, LocalDate birthdate, String major) {
        this.name = name;
        this.family = family;
        this.birthdate = birthdate;
        this.major = major;
        this.grade = 0.0;
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
}
