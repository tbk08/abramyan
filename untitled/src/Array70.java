import java.util.Scanner;

public class Array70 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = in.nextInt();
        }
        for (int i = 0; i < a.length / 2; i++) {
            a[i]+=a[n/2+i];
            a[n/2+i]=a[i]-a[n/2+i];
            a[i]=a[i]-a[n/2+i];
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }
    }
}
