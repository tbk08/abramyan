import java.util.Scanner;

public class Array17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n / 2 + 1; i += 2) {
            System.out.println(a[i]);
            if (i < n / 2){
                System.out.println(a[i+1]);
            }
            if (n - i - 1 > n / 2) {
                System.out.println(a[n - i - 1]);
            }
            if (n - i - 2 > n / 2) {
                System.out.println(a[n - i - 2]);
            }
        }
    }
}
