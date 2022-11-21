import java.util.Scanner;

public class Array100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N=");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = sc.nextInt();
        }

        int ai, i2, k, num;
        for (int i = 0; i < n; i++) {
            num = 0;
            for (i2 = 0; i2 < n; ++i2) if (a[i] == a[i2]) ++num;

            if (num == 2) {
                k = i - 1;
                ai = a[i];
                for (i2 = i; i2 < n; ++i2)
                    if (a[i2] != ai) {
                        ++k;
                        a[k] = a[i2];
                    }
                n = k + 1;
                --i;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }
    }
}
