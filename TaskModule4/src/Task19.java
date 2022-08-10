import java.util.Scanner;


public class Task19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1 Number=");
        int a = in.nextInt();
        System.out.print("2 Number=");
        int b = in.nextInt();
        System.out.print("3 Number=");
        int c = in.nextInt();
        System.out.print("4 Number=");
        int d = in.nextInt();
        if(a!=b&&a!=c&&a!=d) System.out.println("1");
        else if(a!=b&&b!=c&&b!=d) System.out.println("2");
        else if(a!=c&&b!=c&&c!=d) System.out.println("3");
        else if(d!=c&&b!=d&&a!=d) System.out.println("4");
    }
}
