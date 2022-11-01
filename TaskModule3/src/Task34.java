import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x=");
        int x = in.nextInt();
        System.out.print("y=");
        int y = in.nextInt();
        boolean t = (x + y) % 2 == 0;
        System.out.println(t);
    }
}
