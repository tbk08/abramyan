import java.util.Scanner;

public class Array96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N=");
        int n = sc.nextInt();
        int k = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = sc.nextInt();
        }

        for (int i = 1; i < n; ++i) {
            a[++k] = a[i];
            for (int i2 = 0; i2 < k; ++i2)
                if (a[k] == a[i2]) {
                    --k;
                    break;
                }
        }
        ++k;
        for (int i = 0; i < k; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }
    }
}
