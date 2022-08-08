import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A=");
        int a = in.nextInt();
        System.out.print("B=");
        int b = in.nextInt();
        System.out.print("C=");
        int c = in.nextInt();
        System.out.println("Count"+((a*b)/(c*c)));
    }
}
