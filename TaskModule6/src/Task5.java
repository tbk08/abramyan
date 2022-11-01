import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();

        for (double i = 0.1; i <= 1; i+=0.1) {
            System.out.println(i*n);
        }

    }
}
