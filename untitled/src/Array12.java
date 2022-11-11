import java.util.Scanner;

public class Array12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = in.nextInt();
        }
        for (int i = 1; i <n; i += 2) {
            System.out.println("a[" + i + "]=" + a[i]);
        }
    }
}
