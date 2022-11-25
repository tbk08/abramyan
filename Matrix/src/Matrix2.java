import java.util.Scanner;

public class Matrix2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        System.out.print("M=");
        int m = in.nextInt();

        int a[][] = new int[m][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j <= a[i].length; j++) {
                a[i][j - 1] = j * 5;
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
