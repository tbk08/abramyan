import java.util.Scanner;

public class Matrix21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        System.out.print("M=");
        int m = in.nextInt();

        int a[][] = new int[m][n];
        double sum[] = new double[m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("a[" + i + "][" + j + "]=");
                a[i][j] = in.nextInt();
            }
            System.out.println();
        }
        int k=0;
        for (int i = 1; i < a.length; i+=2) {
            for (int j = 0; j < a[i].length; j++) {
                sum[i] += a[i][j];
                k++;
            }
            sum[i]=sum[i]/k;
            k=0;
        }
        for (int i = 1; i < sum.length; i+=2) {
            System.out.println("sum["+i+"]="+(sum[i]));
        }
    }
}
