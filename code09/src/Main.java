public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.name = "Ana";
        e1.family = "Bel";
        e1.code = 1234;
        e1.Job = "Programmer";

        e1.doWork();
        e1.doWork();

        Employee e2 = new Employee();
        e2.name = "Lora";
        e2.family = "Khan";
        e2.code = 4567;
        e2.Job = "Designer";
        e2.doWork();

        e1.getSalary(100000000);
        e2.getSalary(170000000);

        String ans1 = e1.answer("how are you?");
        String ans2 = e2.answer("can you finish this project today?");

        System.out.println(ans1);
        System.out.println(ans2);

        Calculator calc = new Calculator();
        int a = calc.sum(10, 12);
        System.out.println(a);
    }
}
