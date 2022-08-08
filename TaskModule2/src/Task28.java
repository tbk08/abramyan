import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("K=");
        int k = in.nextInt();
        System.out.print("N=");
        int n = in.nextInt();
        System.out.println("Number=" + ((k % 7) + (n-1)));
    }
}
