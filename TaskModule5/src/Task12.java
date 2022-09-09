import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите номер:");
        int n = in.nextInt();
        System.out.print("¬ведите его занчение:");
        double x = in.nextDouble();
        double r, d, l, s = 0;
        switch (n) {
            case 1:
                System.out.println(x);
                d = 2 * x;
                System.out.println(d);
                l = 2 * PI * x;
                System.out.println(l);
                s = PI * x * x;
                System.out.println(s);
                break;
            case 2://d=2*r
                r = x / 2;
                System.out.println(r);
                System.out.println(x);
                l = x * PI;
                System.out.println(l);
                s = PI * r * r;
                System.out.println(s);
                break;
            case 3://l=2*pi*r
                r = (x / PI) / 2;
                System.out.println(r);
                d = 2 * r;
                System.out.println(d);
                System.out.println(x);
                s = PI * r * r;
                System.out.println(s);
                break;
            case 4:// s=pi*r*r
                r = Math.sqrt(s / PI);
                System.out.println(r);
                d = 2 * r;
                System.out.println(d);
                l = 2 * PI * r;
                System.out.println(l);
                System.out.println(s);
                break;
        }
    }
}
