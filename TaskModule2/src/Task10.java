import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number=");
        int n = in.nextInt();
        System.out.println((n % 10)+" "+((n/10)%10));
    }
}
