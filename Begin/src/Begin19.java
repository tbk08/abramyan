import java.util.Scanner;

public class Begin19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x1=");
        int x1= in.nextInt();
        System.out.print("y1=");
        int y1= in.nextInt();
        System.out.print("x2=");
        int x2= in.nextInt();
        System.out.print("y2=");
        int y2= in.nextInt();
        int a=Math.abs(x1-x2);
        int b=Math.abs(y1-y2);
        int s=a*b;
        int p=2*(a+b);
        System.out.println("S="+s);
        System.out.println("P="+p);
    }
}
