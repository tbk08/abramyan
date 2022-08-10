import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1 Number=");
        int a = in.nextInt();
        System.out.print("2 Number=");
        int b = in.nextInt();
        System.out.print("3 Number=");
        int c = in.nextInt();
        if(a<b&&a<c) System.out.println(a);
        else if (b<a&&b<c) {
            System.out.println(b);
        }else if (c<a&&c<b) {
            System.out.println(c);
        }
    }
}
