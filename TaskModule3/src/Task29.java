import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x=");
        int x = in.nextInt();
        System.out.print("y=");
        int y = in.nextInt();
        System.out.print("x1=");
        int x1 = in.nextInt();
        System.out.print("y1=");
        int y1 = in.nextInt();
        System.out.print("x2=");
        int x2 = in.nextInt();
        System.out.print("y2=");
        int y2 = in.nextInt();
        boolean t = (y2 < y && y < y1) && (x1 < x && x < x2);
        System.out.println(t);
    }
}
