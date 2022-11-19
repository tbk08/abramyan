import java.util.Scanner;

public class Array25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n= in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+i+"]=");
            a[i]=in.nextInt();
        }

        int r=a[1]/a[0];
        for (int i=1; i<a.length; ++i) {
            if (r!=a[i]/a[i-1]) {
                r=0;
            }
        }
        System.out.println(r);
    }
}
