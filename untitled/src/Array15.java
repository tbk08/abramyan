import java.util.Scanner;

public class Array15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = in.nextInt();
        }
        for (int i=0; i<n; i+=2){
            System.out.println("a[" + i + "]="+a[i]);
        }
        for (int i=n-(n%2)-1; i>=1; i-=2){
            System.out.println("a[" + i + "]="+a[i]);
        }
    }
}
