import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        System.out.print("K=");
        int k = in.nextInt();
        int l = 0;
        for (int i = k-1; i > n; i--) {
            System.out.println(i);
            l++;
        }
        System.out.println(l);
    }
}
