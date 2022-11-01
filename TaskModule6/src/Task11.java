import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        double s = 0;
        for (int i = 0; i <= n; i++) {
            s = s + (n+i)*(n+i);
        }
        System.out.println(s);
    }
}
