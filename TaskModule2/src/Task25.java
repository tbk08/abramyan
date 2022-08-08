import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("K=");
        int n = in.nextInt();
        System.out.println("Number=" + ((n+3) % 7));
    }
}
