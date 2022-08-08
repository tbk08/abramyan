import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("K=");
        int k = in.nextInt();
        System.out.println("Number=" + ((k % 7) + 5));
    }
}
