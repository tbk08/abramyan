import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * n);
        }

    }
}
