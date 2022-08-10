import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A=");
        int a = in.nextInt();
        System.out.print("B=");
        int b = in.nextInt();
        System.out.print("C=");
        int c = in.nextInt();
        if(a!=b&&a!=c) System.out.println("1");
        else if(a!=b&&b!=c) System.out.println("2");
        else if(a!=c&&b!=c) System.out.println("3");
    }
}
