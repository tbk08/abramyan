import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();

        for (double i = 1.2; i <= 2; i += 0.2) {
            System.out.println(i * n);
        }
    }

}
