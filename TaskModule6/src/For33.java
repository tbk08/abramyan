import java.util.Scanner;

public class For33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("K=");
        int k = in.nextInt();

        int f1 = 1, f2 = 1;
        System.out.println("F1=" + f1);
        System.out.println("F2=" + f2);

        for (int i = 3; i <= k; ++i) {
            f1 = f1 + f2;
            f2 = f1 - f2;
            System.out.println("F" + i + "=" + f1);
        }
    }
}
