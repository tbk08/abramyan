import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A=");
        int a = in.nextInt();
        System.out.print("B=");
        int b = in.nextInt();
        System.out.print("C=");
        int c = in.nextInt();
        int d = b * b - 4 * a * c;
        boolean x = d > 0;
        System.out.println(x);
    }
}
