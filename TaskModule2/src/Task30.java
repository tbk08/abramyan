import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int n = in.nextInt();
        System.out.println("Number=" + ((n / 100) + 1));
    }
}
