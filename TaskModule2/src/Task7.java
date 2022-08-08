import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number=");
        int n = in.nextInt();
        System.out.println("Sum=" + (n / 10 + n % 10) + " Digit=" + ((n / 10) * (n % 10)));
    }
}
