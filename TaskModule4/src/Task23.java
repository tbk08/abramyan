import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x1=");
        int x1 = in.nextInt();
        System.out.print("y1=");
        int y1 = in.nextInt();
        System.out.print("x2=");
        int x2 = in.nextInt();
        System.out.print("y2=");
        int y2 = in.nextInt();
        System.out.print("x3=");
        int x3 = in.nextInt();
        System.out.print("y3=");
        int y3 = in.nextInt();
        int x4 = 0, y4 = 0;
        if (x1 == x2) {
            x4 = x3;
            if (y2 == y3) {
                y4 = y1;
            } else if (y1 == y3) {
                y4 = y2;
            }
        }
        if (x1 == x3) {
            x4 = x2;
            if (y1 == y2) {
                y4 = y3;
            } else if (y3 == y2) {
                y4 = y1;
            }
        }
        if (x2 == x3) {
            x4 = x1;
            if (y1 == y2) {
                y4 = y3;
            } else if (y3 == y1) {
                y4 = y2;
            }
        }
        System.out.println("x4=" + x4 + " y4=" + y4);
    }
}
