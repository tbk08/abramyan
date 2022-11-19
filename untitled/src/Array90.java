import java.util.Scanner;

public class Array90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N=");
        int n = sc.nextInt();
        System.out.print("K=");
        int k = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a["+i+"]=");
            a[i] = sc.nextInt();
        }
        n--;

        for (int i=k-1; i<n; ++i){
            a[i]=a[i+1];
        }
        for (int i = 0; i < n; i++) {
            System.out.println("a["+i+"]="+a[i]);
        }
    }
}
