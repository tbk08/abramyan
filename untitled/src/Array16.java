import java.util.Scanner;

public class Array16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = in.nextInt();
        }

        for (int i = 0; i < a.length/2; i++) {
            System.out.println(a[i]);
            System.out.println(a[n-i-1]);
        }
        if (n%2 != 0 ) System.out.println(a[n/2]);

    }
}
