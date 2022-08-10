import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number=");
        int n = in.nextInt();
        System.out.print("Number=");
        int n2 = in.nextInt();
        if (n > n2)
            System.out.println("2");
        else System.out.println("1");
    }
}
