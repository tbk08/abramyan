import java.util.Scanner;

public class Array97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N=");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = sc.nextInt();
        }
        // 1 1 2 3 4
        // 0 1 2 3 4
        int i2, k = 0;
        for (int i = 0; i < a.length; ++i) {
            for (i2 = i + 1; i2 < a.length; ++i2)
                if (a[i2] == a[i]) {
                    break;
                }
            if (i2 == n) {
                a[k] = a[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }
    }
}
