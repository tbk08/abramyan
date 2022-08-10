import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A=");
        int a = in.nextInt();
        System.out.print("B=");
        int b = in.nextInt();
        if (a != b) {
            if (a > b) b = a;
            else a = b;
        } else {
            a = 0;
            b = 0;
        }
        System.out.println("A=" + a + " B=" + b);
    }
}
