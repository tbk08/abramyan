import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number=");
        int n=in.nextInt();
        System.out.println("First="+(n/10)+" Second="+((n%10)));
    }
}
