import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A=");
        int a = in.nextInt();
        System.out.print("B=");
        int b = in.nextInt();
        System.out.print("C=");
        int c = in.nextInt();
        int sum = 0;
        if (a > b && a > c) {
            sum = +a;
            if (b > c) sum = +b;
            else sum = +c;
        } else if (b > a && b > c) {
            sum = +b;
            if (a > c) sum = +a;
            else sum = +c;
        } else if (c > b && c > a) {
            sum = +c;
            if (b > a) sum = +b;
            else sum = +a;
        }
        System.out.println(sum);
    }
}
