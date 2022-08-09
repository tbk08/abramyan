import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A=");
        int a = in.nextInt();
        boolean x = (a % 2 != 0) && (a > 99 && a < 1000);
        System.out.println(x);
    }
}
