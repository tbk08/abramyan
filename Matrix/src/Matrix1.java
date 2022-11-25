import java.util.Scanner;

public class Matrix1 {
    // m-st
    // n-stol
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        System.out.print("M=");
        int m = in.nextInt();

        int a[][] = new int[m][n];
        for (int i = 1; i <= a.length; i++) {
            for (int j = 0; j < a[i - 1].length; j++) {
                a[i - 1][j] = i * 10;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("a[" + i + "][" + j + "]=" + a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
