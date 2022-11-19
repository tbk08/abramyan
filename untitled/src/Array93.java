import java.util.Scanner;

public class Array93 {
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

        for (int i = 0; i < a.length; i+=2) {
            a[k]=a[i];
            k++;
        }
        for (int i = 0; i < k; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }
    }
}
