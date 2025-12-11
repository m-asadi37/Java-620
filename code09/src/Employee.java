public class Employee {

    String name;
    String family;
    int code;
    String Job;

    //void : no return any result!
    void doWork() {
        System.out.printf("employee %s is working hard!%n", name);
    }

    void getSalary(long salary) {
        salary /= 10;
        System.out.printf("employee get salary with amount = %,d TOMAN%n", salary);
    }

    //return a result in String
    String answer(String question) {
        if (question.equals("how are you?")) {
            return "i'm fine!";
        } else if (question.equals("can you finish this project today?")) {
            return "yes!";
        } else {
            return "i dont know!";
        }
    }
}
