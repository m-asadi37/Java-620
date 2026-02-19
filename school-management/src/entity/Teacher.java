package entity;

public class Teacher {

    private int id;
    private String name;
    private String family;
    private String major;
    private double salary;

    public Teacher(int id, String name, String family, String major, double salary) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.major = major;
        this.salary = salary;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showInfo() {
        System.out.printf("Teacher{id=%d, name='%s', family='%s', major='%s', salary=%,.0f}\n",
                id, name, family, major, salary);
    }
}
