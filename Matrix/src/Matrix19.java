import java.util.Scanner;

public class Matrix19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        System.out.print("M=");
        int m = in.nextInt();

        int a[][] = new int[m][n];
        int sum[] = new int[m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("a[" + i + "][" + j + "]=");
                a[i][j] = in.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum[i] += a[i][j];
            }
        }
        for (int i = 0; i < sum.length; i++) {
            System.out.println("sum["+i+"]="+sum[i]);
        }
    }
}
