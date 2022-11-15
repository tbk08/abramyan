import java.util.Scanner;

public class Array26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = in.nextInt();
        }
        int k = n;
        for (int i = 1; i < a.length; i++) {
            if ((a[i-1] % 2) != (a[i] % 2)) {
                k--;
            }
            else {
                System.out.println("a["+i+"]="+a[i]);
            }
        }

        if (k == 1) {
            System.out.println(0);
        }

    }
}
