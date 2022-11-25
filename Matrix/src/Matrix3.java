import java.util.Scanner;

public class Matrix3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        System.out.print("M=");
        int m = in.nextInt();

        int am[] = new int[m];
        for (int i = 0; i < am.length; i++) {
            am[i] = in.nextInt();
        }

        int a[][] = new int[m][n];
        for (int i = 0; i < a.length; i++) {
            for (int j =0; j < a[i].length; j++) {
                a[i][j] = am[i];
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
