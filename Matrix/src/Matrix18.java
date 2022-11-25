import java.util.Scanner;

public class Matrix18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        System.out.print("M=");
        int m = in.nextInt();
        System.out.print("K=");
        int k = in.nextInt();

        int a[][] = new int[m][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("a[" + i + "][" + j + "]=");
                a[i][j] = in.nextInt();
            }
            System.out.println();
        }
        int s = 0, p = 1;
        for (int i = 0; i < a.length; i++) {
            s += a[i][k];
            p *= a[i][k];
        }

        System.out.println("sum=" + s);
        System.out.println("digit=" + p);
    }
}
