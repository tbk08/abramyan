import java.util.Scanner;

public class Array37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N=");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 2; i < n; ++i) {
            if ((a[i - 2] < a[i - 1]) && !(a[i - 1] < a[i])) {
                count++;
            }
        }
        //a[4]<a[5]
        if (a[n - 2] < a[n - 1]) count++;
        System.out.println(count);
    }
}
