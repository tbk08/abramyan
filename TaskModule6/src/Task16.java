import java.util.Scanner;

public class Task16 {//37

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        double s = 0, nk = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                nk = nk * i;
            }
            s = s + nk;
            nk = 1;
        }
        System.out.println(s);
    }
}
