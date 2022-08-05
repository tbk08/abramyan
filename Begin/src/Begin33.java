import java.util.Scanner;

public class Begin33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kg=");
        int x=in.nextInt();
        System.out.print("Price:");
        int a=in.nextInt();
        System.out.print("y=");
        int y=in.nextInt();
        int kg=a/x;
        System.out.println("Price y="+(kg*y));
    }
}
