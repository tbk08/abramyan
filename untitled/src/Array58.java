import java.util.Scanner;

public class Array58 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = in.nextInt();
        }
        int s=0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i+1; j++) {
                s=s+a[j];
            }
            b[i]=s;
            s=0;
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "]="+b[i]);
        }
    }
}
