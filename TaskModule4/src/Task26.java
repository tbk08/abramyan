import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x=");
        double x = in.nextDouble();
        double f = 0;
        if (x <= 0) f = (-1) * x;
        if (0 < x && x < 2) f = x * x;
        if (x >= 2) f = 4;
        System.out.println("f(x)=" + f);
    }
}
