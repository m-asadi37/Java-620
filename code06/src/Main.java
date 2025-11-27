
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] arr = new String[5];

        //index -> 0,1,2,3,4
        arr[0] = scan.nextLine();
        arr[1] = scan.nextLine();

        String ind3 = arr[3];
        System.out.println(ind3);
        System.out.println(arr[2]);

        System.out.println("size of arras : ");
        int size = scan.nextInt();
        //size = 3
        //0-1-2
        int[] arr2 = new int[size];

        for (int i = 0; i < arr2.length; i++) {
            int input = scan.nextInt();
            arr2[i] = input;
        }

        for (int i = 0; i < arr2.length; i++)
            System.out.println(arr2[i]);
    }
}
