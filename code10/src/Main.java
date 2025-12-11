import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int d = scanner.nextInt();

        int[][] arr = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int count = 1;

        while (left <= right && top <= bottom) {

            for (int i = left; i <= right; i++) {
                arr[bottom][i] = count++;
            }
            bottom -= 1;

            for (int i = bottom; i >= top; i--) {
                arr[i][right] = count++;
            }
            right -= 1;

            for (int i = right; i >= left; i--) {
                arr[top][i] = count++;
            }
            top += 1;

            for (int i = top; i <= bottom; i++) {
                arr[i][left] = count++;
            }
            left += 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("top : " + top);
        System.out.println("bottom : " + bottom);
        System.out.println("left : " + left);
        System.out.println("right : " + right);

        int rowS = -1, colS = -1, rowD = -1, colD = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == s) {
                    rowS = i;
                    colS = j;
                }
                if (arr[i][j] == d) {
                    rowD = i;
                    colD = j;
                }
            }
        }

        if(rowS > rowD)
            System.out.println((rowS - rowD) + " U");
        else if (rowS < rowD) {
            System.out.println((rowD - rowS) + " D");
        }

        if(colS > colD)
            System.out.println((colS - colD) + " L");
        if(colS < colD)
            System.out.println((colD - colS) + " R");
    }
}
