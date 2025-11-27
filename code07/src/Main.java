import java.util.Scanner;

public class Main {

    public static void main1(String[] args) {

        double[] arr = {1.1, 2.2, 3.3, 4.4};
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        int[][] arr2D = new int[3][4];
        arr2D[0][0] = 1;
        arr2D[0][1] = 2;
        arr2D[0][2] = 3;
        arr2D[0][3] = 4;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr2D[i][j] = i * 10 + j;
            }
        }
        for (int i = 0; i < arr2D.length; i++) {
            int[] row = arr2D[i];
            for (int j = 0; j < arr2D[0].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        String[][][] arr3D = new String[1][2][3];
        for (int i = 0; i < arr3D.length; i++) {
            for (int j = 0; j < arr3D[0].length; j++) {
                for (int k = 0; k < arr3D[0][0].length; k++) {
                    arr3D[i][j][k] = "*";
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("input your array size: ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("input your array element [%d]: ", i);
            int value = scan.nextInt();
            arr[i] = value;
        }

        int max = arr[0], min = arr[0];
        double sum = 0.0;
        for (int i = 0; i < size; i++) {
            int val = arr[i];
            sum += val;

            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("average is " + sum / size);
        System.out.println("max is " + max);
        System.out.println("min is " + min);
    }
}
