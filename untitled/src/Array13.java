import java.util.Scanner;

public class Array13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = in.nextInt();
        }
        for (int i = n - 1; i >= 0; i -= 2) {
            System.out.println("a[" + i + "]=" + a[i]);
        }
    }
}
