import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        System.out.print("M=");
        int m = in.nextInt();
        int s = 0;
        for (int i = n ; i <= m; i++) {
            s = s + i;
        }
        System.out.println(s);
    }
}
