import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();//2
        System.out.print("K=");
        int k = in.nextInt();//5
        int l=0;
        for (int i = n; i <= k; i++) {
            System.out.println(i);
            l++;
        }
        System.out.println(l);
    }
}
