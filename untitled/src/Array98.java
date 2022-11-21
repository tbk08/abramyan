import java.util.Scanner;

public class Array98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N=");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = sc.nextInt();
        }
        int i2, k = -1, num;
        for (int i = 0; i < n; ++i) {
            for (i2 = 0; i2 <= k; ++i2) {
                if (a[i] == a[i2]) break;
            }
            if (i2 != k + 1) {
                ++k;
                a[k] = a[i];
            } else {
                num = 0;
                for (i2 = i; i2 < n; ++i2) {
                    if (a[i2] == a[i])
                        ++num;
                }
                if (num >= 3) {
                    ++k;
                    a[k] = a[i];
                }
            }
        }
        ++k;

        for (int i = 0; i < k; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }
    }
}
