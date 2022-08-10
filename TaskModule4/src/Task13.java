import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1 Number=");
        int a = in.nextInt();
        System.out.print("2 Number=");
        int b = in.nextInt();
        System.out.print("3 Number=");
        int c = in.nextInt();
        if ((a < b && b < c) || (c < b && b < a)) System.out.println(b);
        else if ((b < a && a < c) || (c < a && a < b)) {
            System.out.println(a);
        } else if ((a < c && c < b) || (c < c && c < a)) {
            System.out.println(c);
        }
    }
}
