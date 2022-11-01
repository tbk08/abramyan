import java.util.Scanner;

import static java.lang.Math.abs;
public class Task36 {
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

        boolean t = (x==x2&&y!=y2);
        boolean t1 = (x!=x2&&y==y2);
        System.out.println(t||t1);
    }
}
