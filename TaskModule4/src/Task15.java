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

        if (a > b && a > c) {
            System.out.print(a+" ");
            if(b>c) System.out.println(b);
            else System.out.println(c);
        }
        if (b > a && b > c) {
            System.out.print(b+" ");
            if(a>c) System.out.println(a);
            else System.out.println(c);
        }
        if (c > b && c > a) {
            System.out.print(c+" ");
            if(b>a) System.out.println(b);
            else System.out.println(a);
        }

        /*if (a > b && a > c) {
            if (b > c) {
                sum = a + b;
            } else {
                sum = a+c;
            }
        } else if (b > a && b > c) {
            if (a > c) {
                sum = b+a;
            } else {
                sum = b+c;
            }
        } else if (c > b && c > a) {
            if (b > a) {
                sum = c+b;
            } else {
                sum = c+a;
            }
        }
        //System.out.println(sum);
*/

    }
}
