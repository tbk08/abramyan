import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a=");
        int a = in.nextInt();
        System.out.print("b=");
        int b = in.nextInt();
        System.out.print("c=");
        int c = in.nextInt();
        boolean t = a==b&&b==c;
        System.out.println(t);
    }
}
