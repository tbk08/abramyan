import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number=");
        int n = in.nextInt();
        System.out.println(((n%3600))/60);
    }
}