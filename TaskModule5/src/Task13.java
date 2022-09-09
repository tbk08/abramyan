import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите номер:");
        int n = in.nextInt();
        System.out.print("¬ведите его занчение:");
        double x = in.nextDouble();
        double a, c, h, s = 0;
        switch (n) {
            case 1:
                System.out.println(x);
                c = x * Math.sqrt(2);
                System.out.println(c);
                h = c / 2;
                System.out.println(h);
                s = c * (h / 2);
                System.out.println(s);
                break;
            case 2://a=c/sqrt2
                a = x / Math.sqrt(2);
                System.out.println(a);
                System.out.println(x);
                h = x / 2;
                System.out.println(h);
                s = x * (h / 2);
                System.out.println(s);
                break;
            case 3://c=h*2
                a = (x * 2) / Math.sqrt(2);
                System.out.println(a);
                c = x * 2;
                System.out.println(c);
                System.out.println(x);
                s = c * (x / 2);
                System.out.println(s);
                break;
            case 4://
                a = Math.sqrt(2 * x);
                System.out.println(a);
                c = 2 * Math.sqrt(x);
                System.out.println(c);
                h = Math.sqrt(x);
                System.out.println(h);
                System.out.println(x);
                break;
        }
    }
}
