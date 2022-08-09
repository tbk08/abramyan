import java.util.Scanner;

public class Task35 {
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
        boolean t = (((x + y) % 2 != 0)&&((x2 + y2) % 2 != 0))||(((x + y) % 2 == 0)&&((x2 + y2) % 2 == 0));
        System.out.println(t);
    }
}
