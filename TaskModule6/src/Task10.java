import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + 1 / (double) i;
        }
        System.out.println(s);
    }
}
