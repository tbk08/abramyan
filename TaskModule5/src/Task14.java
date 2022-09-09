import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите номер:");
        int n = in.nextInt();
        System.out.print("¬ведите его занчение:");
        double x = in.nextDouble();
        double a, r1, r2, s = 0;
        switch (n) {
            case 1:
                System.out.println(x);
                r1 = (x * Math.sqrt(3)) / 6;
                System.out.println(r1);
                r2 = 2 * r1;
                System.out.println(r2);
                s = (x * x * Math.sqrt(3)) / 4;
                System.out.println(s);
                break;
            case 2:
                a = (x * 6) / Math.sqrt(3);
                System.out.println(a);
                System.out.println(x);
                r2 = 2 * x;
                System.out.println(r2);
                s = 3 * Math.sqrt(3) * x;
                System.out.println(s);
                break;
            case 3:
                r1 = x / 2;
                a = (x * 6) / Math.sqrt(3);
                System.out.println(a);
                System.out.println(r1);
                System.out.println(x);
                s = 3 * Math.sqrt(3) * r1;
                System.out.println(s);
                break;
            case 4:
                r1 = s / (3 * Math.sqrt(3));
                a = (r1 * 6) / Math.sqrt(3);
                System.out.println(a);
                System.out.println(r1);
                r2 = r1 * 2;
                System.out.println(r2);
                System.out.println(x);
                break;
        }
    }
}
