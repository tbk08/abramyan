import java.util.Scanner;

public class Begin40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("A1=");
        int a=in.nextInt();
        System.out.print("B1=");
        int b=in.nextInt();
        System.out.print("C1=");
        int c=in.nextInt();
        System.out.print("A2=");
        int a2=in.nextInt();
        System.out.print("B2=");
        int b2=in.nextInt();
        System.out.print("C2=");
        int c2=in.nextInt();
        double x,y;
        int d;
        d=a*b2-a2*b;
        x=(c*b2-c2*b)/d;
        y=(a*c2-a2*c)/d;

        System.out.println("x="+x);
        System.out.println("y="+y);

    }
}
