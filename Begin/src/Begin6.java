import java.util.Scanner;

public class Begin6 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("a=");
        int a=in.nextInt();
        System.out.print("b=");
        int b=in.nextInt();
        System.out.print("c=");
        int c=in.nextInt();
        final int V=a*b*c;
        final int S=2*(a*b+b*c+c*a);
        System.out.println("V="+V);
        System.out.println("S="+S);
    }
}
