import java.util.Random;

public class Main {

    public static void main1(String[] args) {

        double r = 10;
        double area = 2 * r * Math.PI;

        int i1 = Math.abs(-10);
        double i2 = Math.abs(12.24);

        int i3 = Math.min(1, 2);

        System.out.println(Math.pow(3, 2));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(64.0, 1.0 / 3.0));

        System.out.println(Math.round(10.3));
        System.out.println(Math.round(10.8));

        System.out.println(Math.floor(3.9));
        System.out.println(Math.ceil(1.1));

        System.out.println(Math.sin(Math.PI / 2));
        System.out.println(Math.cos(Math.PI / 2));

        System.out.println(Math.toRadians(90));
        System.out.println(Math.toDegrees(Math.PI / 4));

        System.out.println(Math.log10(100));
        System.out.println(Math.log10(0.1));

        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int n = 1000;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (random.nextInt(10));
        }
        System.out.println(sum / (n * 1.0));
    }
}
