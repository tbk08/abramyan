import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A=");
        int a = in.nextInt();
        System.out.print("B=");
        int b = in.nextInt();
        boolean x = (a%2!=0&&b%2==0)||(a%2==0&&b%2!=0);
        System.out.println(x);
    }
}
