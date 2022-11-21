import java.util.Scanner;

public class Array52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N=");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < b.length; i++) {
            if(a[i]<5){
                b[i]=2*a[i];
            }
            else {
                b[i]=a[i]/2;
            }
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "]="+b[i]);
        }
    }
}
