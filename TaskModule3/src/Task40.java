import java.util.Scanner;

import static java.lang.Math.abs;

public class Task40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x1=");
        int x = in.nextInt();
        System.out.print("y1=");
        int y = in.nextInt();
        System.out.print("x2=");
        int x2 = in.nextInt();
        System.out.print("y2=");
        int y2 = in.nextInt();
        boolean t = (abs(x - x2) == 2 && abs(y - y2) == 1) || (abs(x - x2) == 1 && abs(y - y2) == 2);
        System.out.println(t);
    }
}
