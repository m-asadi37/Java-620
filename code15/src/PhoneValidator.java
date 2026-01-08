import java.util.Scanner;

public class PhoneValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            String phone = scanner.next();
            if (phone.matches("\\+98\\d{10}"))
                System.out.println(phone);
        }
    }
}
