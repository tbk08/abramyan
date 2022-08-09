import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A=");
        int a = in.nextInt();
        boolean x = (a / 100) != ((a / 10) % 10) || ((a / 10) % 10) != a % 10 || a % 10 != a / 100;
        System.out.println(x);
    }
}
